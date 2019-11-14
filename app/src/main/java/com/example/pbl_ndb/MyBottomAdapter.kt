/*
package com.example.pbl_ndb

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyBottomAdapter (private var activity: Activity, private var items: ArrayList<Item>) :  BaseAdapter(){
    private class ViewHolder(row: View?) {
        var bottomName: TextView? = null
        var bottomPrice: TextView? = null
        var bottomImage: ImageView? = null

        init {
            this.bottomName = row?.findViewById<TextView>(R.id.name)
            this.bottomPrice = row?.findViewById<TextView>(R.id.price)
            this.bottomImage = row?.findViewById<ImageView>(R.id.image)

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.gridview_layout, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var bottom = items[position]
        viewHolder.bottomName?.text =  bottom.item_name
        viewHolder.bottomPrice?.text = bottom.item_price.toString()


        viewHolder.bottomImage?.setImageResource(bottom.item_image!!)

        return view as View
    }
    override fun getItem(i: Int): Item {
        return items[i]
    }
    override fun getItemId(i: Int): Long {
        return i.toLong()
    }
    override fun getCount(): Int {
        return items.size
    }
}
*/

package com.example.pbl_ndb

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyBottomAdapter (private var activity: Activity, private var items: ArrayList<ItemDAO>) :  BaseAdapter(){
    private class ViewHolder(row: View?) {
        var bottomName: TextView? = null
        var bottomPrice: TextView? = null
        var bottomImage: ImageView? = null

        init {
            this.bottomName = row?.findViewById<TextView>(R.id.name)
            this.bottomPrice = row?.findViewById<TextView>(R.id.price)
            this.bottomImage = row?.findViewById<ImageView>(R.id.image)

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.gridview_layout, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var bottom = items[position]
        viewHolder.bottomName?.text =  bottom.name
        viewHolder.bottomPrice?.text = bottom.price.toString()


        //viewHolder.bottomImage?.setImageResource(bottom.item_image!!)

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