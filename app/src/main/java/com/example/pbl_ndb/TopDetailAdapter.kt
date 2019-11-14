package com.example.pbl_ndb

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class TopDetailAdapter (private var activity: Activity, private var items: ArrayList<ItemDAO>) :  BaseAdapter(){
    private class ViewHolder(row: View?) {
        var topName: TextView? = null
        var topPrice: TextView? = null
        var topImage: ImageView? = null
        var topDesc: TextView? = null

        init {
            this.topName = row?.findViewById<TextView>(R.id.textViewName)
            this.topPrice = row?.findViewById<TextView>(R.id.textViewPrice)
            this.topDesc = row?.findViewById<TextView>(R.id.textViewDesc)
            this.topImage = row?.findViewById<ImageView>(R.id.imageView)

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View
        if (convertView == null) {
            val inflater =
                activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.gridview_layout, null)
        } else {
            view = convertView
        }
        var topName: TextView? = null
        var topPrice: TextView? = null
        var topImage: ImageView? = null
        var topDesc: TextView? = null

        var topDetail = items[position]
        topName?.text =  topDetail.name
        topPrice?.text = topDetail.price.toString()
        topDesc?.text =  topDetail.description


        //viewHolder.topImage?.setImageResource(top.item_image!!)

        return view as View
    }


    override fun getItem(i: Int): ItemDAO {
        return items[i]
    }
    override fun getItemId(i: Int): Long {
        return i.toLong()
    }
    override fun getCount(): Int {
        return items.size
    }

}