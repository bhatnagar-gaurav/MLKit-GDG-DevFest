package com.gdg.devfest.mlkit.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gdg.devfest.mlkit.ui.ImageLabelActivity
import com.gdg.devfest.mlkit.ui.ImageLabelOnCloud
import com.gdg.devfest.mlkit.ui.LandmarkDetectorActivity
import com.gdg.devfest.mlkit.R
import com.gdg.devfest.mlkit.model.PojoApi
import com.gdg.devfest.mlkit.ui.FaceDetectionActivity
import kotlinx.android.synthetic.main.item_row_home.view.*

class HomeAdapter(private val apiList: List<PojoApi>) : RecyclerView.Adapter<HomeAdapter.HomeHolder>() {

    private lateinit var context: Context

    class HomeHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
        val currItem = apiList[position]
        with(holder.itemView) {
            tViewApiName.text = currItem.title
            tViewApiDesc.text = currItem.desc
            iViewApi.setImageResource(currItem.imageId)
            cViewHome.setOnClickListener {
                when (currItem.id) {
                    0 -> context.startActivity(Intent(context, ImageLabelActivity::class.java))
                    1 -> context.startActivity(Intent(context, ImageLabelOnCloud::class.java))
                    2 -> Toast.makeText(context,"Text Recognition capability implemented in separate example",Toast.LENGTH_LONG).show()
                    3 -> Toast.makeText(context,"Bar Code Scanning capability implemented in separate example",Toast.LENGTH_LONG).show()
                    4 -> context.startActivity(Intent(context, LandmarkDetectorActivity::class.java))
                    5 -> context.startActivity(Intent(context, FaceDetectionActivity::class.java))
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        context = parent.context
        return HomeHolder(LayoutInflater.from(context).inflate(R.layout.item_row_home, parent, false))
    }

    override fun getItemCount() = apiList.size
}