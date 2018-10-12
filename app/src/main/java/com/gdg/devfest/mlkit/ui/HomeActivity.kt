package com.gdg.devfest.mlkit.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.gdg.devfest.mlkit.R
import com.gdg.devfest.mlkit.adapter.HomeAdapter
import com.gdg.devfest.mlkit.model.PojoApi
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val apiList by lazy {
        ArrayList<PojoApi>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        with(apiList) {
            add(PojoApi(R.drawable.image_labelling, getString(R.string.title_labelling_ondevice), getString(R.string.desc_labelling_ondevice), 0))
            add(PojoApi(R.drawable.image_labelling_oncloud, getString(R.string.title_labelling_oncloud), getString(R.string.desc_labelling_oncloud), 1))
            add(PojoApi(R.drawable.text_recognition, getString(R.string.title_text), getString(R.string.desc_text), 2))
            add(PojoApi(R.drawable.barcode_scanning, getString(R.string.title_barcode), getString(R.string.desc_barcode), 3))
            add(PojoApi(R.drawable.landmark_identification, getString(R.string.title_landmark), getString(R.string.desc_landmark), 4))
            add(PojoApi(R.drawable.face_detection, getString(R.string.title_face), getString(R.string.desc_face), 5))
        }

        rvHome.layoutManager = LinearLayoutManager(this)
        rvHome.adapter = HomeAdapter(apiList)
    }
}
