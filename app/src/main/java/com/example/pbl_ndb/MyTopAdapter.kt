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

class MyTopAdapter (private var activity: Activity, private var items: ArrayList<Item>) :  BaseAdapter(){
    private class ViewHolder(row: View?) {
        var topName: TextView? = null
        var topPrice: TextView? = null
        var topImage: ImageView? = null

        init {
            this.topName = row?.findViewById<TextView>(R.id.name)
            this.topPrice = row?.findViewById<TextView>(R.id.price)
            this.topImage = row?.findViewById<ImageView>(R.id.image)

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
        var top = items[position]
        viewHolder.topName?.text =  top.item_name
        viewHolder.topPrice?.text = top.item_price.toString()


        viewHolder.topImage?.setImageResource(top.item_image!!)

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

class MyTopAdapter (private var activity: Activity, private var items: ArrayList<ItemDAO>) :  BaseAdapter(){
    private class ViewHolder(row: View?) {
        var topName: TextView? = null
        var topPrice: TextView? = null
        var topImage: ImageView? = null

        init {
            this.topName = row?.findViewById<TextView>(R.id.name)
            this.topPrice = row?.findViewById<TextView>(R.id.price)
            this.topImage = row?.findViewById<ImageView>(R.id.image)

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
        var top = items[position]
        viewHolder.topName?.text =  top.name
        viewHolder.topPrice?.text = top.price.toString()


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