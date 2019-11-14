package com.example.pbl_ndb

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyOuterAdapter (private var activity: Activity, private var items: ArrayList<ItemDAO>) :  BaseAdapter() {
    private class ViewHolder(row: View?) {
        var outerName: TextView? = null
        var outerPrice: TextView? = null
        var outerImage: ImageView? = null

        init {
            this.outerName = row?.findViewById<TextView>(R.id.name)
            this.outerPrice = row?.findViewById<TextView>(R.id.price)
            this.outerImage = row?.findViewById<ImageView>(R.id.image)

        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater =
                activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.gridview_layout, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var outer = items[position]
        viewHolder.outerName?.text = outer.name
        viewHolder.outerPrice?.text = outer.price.toString()


        //viewHolder.outerImage?.setImageResource(outer.image!!)

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