package com.example.pbl_ndb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_top.*

class OuterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outer)
        setTitle("Outer")

        var adapter : MyOuterAdapter? = null
        var topList : ArrayList<ItemDAO>
        topList = generateItemData()
        //Log.d("exist", topList.toString())
        adapter = MyOuterAdapter(this, topList)

        grid.adapter = adapter
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
        val outers = db.collection("outers")

        var outerDAO1: ItemDAO = ItemDAO()
        outers.document("outer1").get().addOnSuccessListener { document ->
            var outer1 = document?.toObject(ItemDAO::class.java)

            outerDAO1.id = outer1?.id
            outerDAO1.name = outer1?.name
            outerDAO1.price = outer1?.price
            outerDAO1.description = outer1?.description

        }
        result.add(outerDAO1)

        var outerDAO2: ItemDAO = ItemDAO()
        outers.document("outer2").get().addOnSuccessListener { document ->
            var outer2 = document?.toObject(ItemDAO::class.java)

            outerDAO2.id = outer2?.id
            outerDAO2.name = outer2?.name
            outerDAO2.price = outer2?.price
            outerDAO2.description = outer2?.description

        }
        result.add(outerDAO2)

        var outerDAO3: ItemDAO = ItemDAO()
        outers.document("outer3").get().addOnSuccessListener { document ->
            var outer3 = document?.toObject(ItemDAO::class.java)

            outerDAO3.id = outer3?.id
            outerDAO3.name = outer3?.name
            outerDAO3.price = outer3?.price
            outerDAO3.description = outer3?.description

        }
        result.add(outerDAO3)

        var outerDAO4: ItemDAO = ItemDAO()
        outers.document("outer4").get().addOnSuccessListener { document ->
            var outer4 = document?.toObject(ItemDAO::class.java)

            outerDAO4.id = outer4?.id
            outerDAO4.name = outer4?.name
            outerDAO4.price = outer4?.price
            outerDAO4.description = outer4?.description

        }
        result.add(outerDAO4)

        var outerDAO5: ItemDAO = ItemDAO()
        outers.document("outer5").get().addOnSuccessListener { document ->
            var outer5 = document?.toObject(ItemDAO::class.java)

            outerDAO5.id = outer5?.id
            outerDAO5.name = outer5?.name
            outerDAO5.price = outer5?.price
            outerDAO5.description = outer5?.description

        }
        result.add(outerDAO5)

        var outerDAO6: ItemDAO = ItemDAO()
        outers.document("outer6").get().addOnSuccessListener { document ->
            var outer6 = document?.toObject(ItemDAO::class.java)

            outerDAO6.id = outer6?.id
            outerDAO6.name = outer6?.name
            outerDAO6.price = outer6?.price
            outerDAO6.description = outer6?.description

        }
        result.add(outerDAO6)

        var outerDAO7: ItemDAO = ItemDAO()
        outers.document("outer7").get().addOnSuccessListener { document ->
            var outer7 = document?.toObject(ItemDAO::class.java)

            outerDAO7.id = outer7?.id
            outerDAO7.name = outer7?.name
            outerDAO7.price = outer7?.price
            outerDAO7.description = outer7?.description

        }
        result.add(outerDAO7)

        return result
    }
}
