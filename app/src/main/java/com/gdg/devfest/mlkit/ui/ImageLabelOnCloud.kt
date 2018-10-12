package com.gdg.devfest.mlkit.ui

import android.graphics.Bitmap
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.gdg.devfest.mlkit.R
import com.gdg.devfest.mlkit.adapter.ImageLabelAdapter
import com.google.firebase.ml.vision.FirebaseVision
import com.google.firebase.ml.vision.common.FirebaseVisionImage
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_image_label.*

class ImageLabelOnCloud : BaseCameraActivity() {

    private var itemsList: ArrayList<Any> = ArrayList()
    private lateinit var itemAdapter: ImageLabelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBottomSheet(R.layout.activity_image_label_on_cloud)
        rvLabel.layoutManager = LinearLayoutManager(this)
    }

    private fun getLabelsViaCloud(bitmap: Bitmap) {
        val image = FirebaseVisionImage.fromBitmap(bitmap)
        val detector = FirebaseVision.getInstance()
                .visionCloudLabelDetector
        itemsList.clear()
        detector.detectInImage(image)
                .addOnSuccessListener {
                    // Task completed successfully
                    fabProgressCircle.hide()
                    itemsList.addAll(it)
                    itemAdapter = ImageLabelAdapter(itemsList, true)
                    rvLabel.adapter = itemAdapter
                    descriptionBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
                    btnRetry.visibility = View.GONE
                }
                .addOnFailureListener {
                    // Task failed with an exception
                    fabProgressCircle.hide()
                    Toast.makeText(baseContext,"Sorry, something went wrong!", Toast.LENGTH_SHORT).show()
                }
    }

    override fun onClick(v: View?) {
        fabProgressCircle.show()
        cameraView.captureImage { cameraKitImage ->
            // Get the Bitmap from the captured shot
            getLabelsViaCloud(cameraKitImage.bitmap)
            runOnUiThread {
                showPreview()
                imagePreview.setImageBitmap(cameraKitImage.bitmap)
            }
        }
    }
}
