package com.example.recyclerView

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.activity.RecyclerView
import com.example.kot.R

class rvAdapter(private val dataList: ArrayList<rvDataClass>):RecyclerView.Adapter<rvAdapter.ViewHolderClass>() {

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvImage = itemView.findViewById<ImageView>(R.id.image)
        val rvTitle = itemView.findViewById<TextView>(androidx.appcompat.R.id.title)
    }

}