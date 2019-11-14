package com.example.pbl_ndb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_top.*

class TopActivity : AppCompatActivity() {

    // Cloud Firestore 초기화
    //val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
        setTitle("Top")

        var textViewName = findViewById<TextView>(R.id.textViewName)
        var textViewPrice = findViewById<TextView>(R.id.textViewPrice)
        var imageView = findViewById<ImageView>(R.id.imageView)
        var textViewDesc = findViewById<TextView>(R.id.textViewDesc)

        var adapter : MyTopAdapter? = null
        var topList : ArrayList<ItemDAO>
        topList = generateItemData()
        //Log.d("exist", topList.toString())
        adapter = MyTopAdapter(this, topList)

        grid.adapter = adapter

        grid.setOnItemClickListener { adapterView, view, i, l ->
            val topDetailIntent = Intent(this, TopDetailActivity::class.java)
            startActivity(topDetailIntent)
        }
    }

    private fun generateItemData(): ArrayList<ItemDAO> {
        var result = ArrayList<ItemDAO>()

        val db = FirebaseFirestore.getInstance()

        // Pull Driven 방식. Controller가 원하는 타이밍에 데이터를 읽어오는 방식
        // 보통 한 번만 데이터를 읽어올 때 많이 사용
        // get().addOnCompleteListener를 입력
        // vs
        // 데이터가 변경될 때마다 뷰를 그려주는 구조를 만들기 위해서 많이 사용
        // 특히 실시간으로 반영되는 리스트나 채팅을 만들 때 많이 사용
        // get.addOnCompleteListener 대신 addSnapshotListener 사용
        // Firestore에서 데이터 가져오기
        val tops = db.collection("tops")

        var topDAO1: ItemDAO = ItemDAO()
        tops.document("top1").get().addOnSuccessListener { document ->
            var top1 = document?.toObject(ItemDAO::class.java)

            topDAO1.id = top1?.id
            topDAO1.name = top1?.name
            topDAO1.price = top1?.price
            topDAO1.description = top1?.description

            //Log.d("exist", topDAO1.id.toString())
            //result.add(topDAO1) // 그리드뷰 안 나옴
            //Log.d("exist2", result.toString())  // 안에서는 값 다 저장됨
        }
        result.add(topDAO1) // 그리드뷰 뜨는데 0으로 나옴
        //Log.d("exist", result.toString()) // 여기는 아예 안들어감

        var topDAO2: ItemDAO = ItemDAO()
        tops.document("top2").get().addOnSuccessListener { document ->
            var top2 = document?.toObject(ItemDAO::class.java)

            topDAO2.id = top2?.id
            topDAO2.name = top2?.name
            topDAO2.price = top2?.price
            topDAO2.description = top2?.description
            //Log.d("exist", result.toString())
            //Log.d("exist2", topDAO2.id.toString())
            //result.add(topDAO2)
            //Log.d("exist2", result.toString())
        }
        result.add(topDAO2)

        var topDAO3: ItemDAO = ItemDAO()
        tops.document("top3").get().addOnSuccessListener { document ->
            var top3 = document?.toObject(ItemDAO::class.java)

            topDAO3.id = top3?.id
            topDAO3.name = top3?.name
            topDAO3.price = top3?.price
            topDAO3.description = top3?.description
            //result.add(topDAO3)
            //Log.d("exist", result.toString())
        }
        result.add(topDAO3)

        var topDAO4: ItemDAO = ItemDAO()
        tops.document("top4").get().addOnSuccessListener { document ->
            var top4 = document?.toObject(ItemDAO::class.java)

            topDAO4.id = top4?.id
            topDAO4.name = top4?.name
            topDAO4.price = top4?.price
            topDAO4.description = top4?.description
            //result.add(topDAO4)
            //Log.d("exist", result.toString())
        }
        result.add(topDAO4)

        var topDAO5: ItemDAO = ItemDAO()
        tops.document("top5").get().addOnSuccessListener { document ->
            var top5 = document?.toObject(ItemDAO::class.java)

            topDAO5.id = top5?.id
            topDAO5.name = top5?.name
            topDAO5.price = top5?.price
            topDAO5.description = top5?.description
            //result.add(topDAO5)
            //Log.d("exist", result.toString())
        }
        result.add(topDAO5)

        var topDAO6: ItemDAO = ItemDAO()
        tops.document("top6").get().addOnSuccessListener { document ->
            var top6 = document?.toObject(ItemDAO::class.java)

            topDAO6.id = top6?.id
            topDAO6.name = top6?.name
            topDAO6.price = top6?.price
            topDAO6.description = top6?.description
            //result.add(topDAO6)
            //Log.d("exist", result.toString())
        }
        result.add(topDAO6)

        var topDAO7: ItemDAO = ItemDAO()
        tops.document("top7").get().addOnSuccessListener { document ->
            var top7 = document?.toObject(ItemDAO::class.java)

            topDAO7.id = top7?.id
            topDAO7.name = top7?.name
            topDAO7.price = top7?.price
            topDAO7.description = top7?.description
            //result.add(topDAO7)
            //.d("exist", result.toString())
            Log.d("exist", result.toString())
        }
        result.add(topDAO7)

        Log.d("exist2", result.toString())
        return result
    }
}
