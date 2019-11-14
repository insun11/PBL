package com.example.pbl_ndb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_top.*

class BottomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)
        setTitle("Bottom")

        var adapter : MyBottomAdapter? = null
        var bottomList : ArrayList<ItemDAO>
        bottomList = generateItemData()
        adapter = MyBottomAdapter(this, bottomList)

        grid.adapter = adapter

        grid.setOnItemClickListener { adapterView, view, i, l ->
            //Toast.makeText(this, " Selected Company is = "+ companyList.get(i).company_name , Toast.LENGTH_SHORT).show()
        }
    }

    private fun generateItemData(): ArrayList<ItemDAO> {
        var result = ArrayList<ItemDAO>()

        val db = FirebaseFirestore.getInstance()

        val bottoms = db.collection("bottoms")

        var bottomDAO1: ItemDAO = ItemDAO()
        bottoms.document("bottom1").get().addOnSuccessListener { document ->
            var bottom1 = document?.toObject(ItemDAO::class.java)

            bottomDAO1.id = bottom1?.id
            bottomDAO1.name = bottom1?.name
            bottomDAO1.price = bottom1?.price
            bottomDAO1.description = bottom1?.description

            Log.d("exist2", bottomDAO1.id.toString())
            //result.add(topDAO1) // 그리드뷰 안 나옴
            Log.d("exist2", result.toString())  // 안에서는 값 다 저장됨
        }
        result.add(bottomDAO1) // 그리드뷰 뜨는데 0으로 나옴
        Log.d("exist", result.toString()) // 여기는 아예 안들어감

        var bottomDAO2: ItemDAO = ItemDAO()
        bottoms.document("bottom2").get().addOnSuccessListener { document ->
            var bottom2 = document?.toObject(ItemDAO::class.java)

            bottomDAO2.id = bottom2?.id
            bottomDAO2.name = bottom2?.name
            bottomDAO2.price = bottom2?.price
            bottomDAO2.description = bottom2?.description
            //Log.d("exist", result.toString())
            Log.d("exist2", bottomDAO2.id.toString())
            //result.add(topDAO2)
            Log.d("exist2", result.toString())
        }
        result.add(bottomDAO2)

        var bottomDAO3: ItemDAO = ItemDAO()
        bottoms.document("bottom3").get().addOnSuccessListener { document ->
            var bottom3 = document?.toObject(ItemDAO::class.java)

            bottomDAO3.id = bottom3?.id
            bottomDAO3.name = bottom3?.name
            bottomDAO3.price = bottom3?.price
            bottomDAO3.description = bottom3?.description
            //result.add(topDAO3)
            //Log.d("exist", result.toString())
        }
        result.add(bottomDAO3)

        var bottomDAO4: ItemDAO = ItemDAO()
        bottoms.document("bottom4").get().addOnSuccessListener { document ->
            var bottom4 = document?.toObject(ItemDAO::class.java)

            bottomDAO4.id = bottom4?.id
            bottomDAO4.name = bottom4?.name
            bottomDAO4.price = bottom4?.price
            bottomDAO4.description = bottom4?.description
            //result.add(topDAO4)
            //Log.d("exist", result.toString())
        }
        result.add(bottomDAO4)

        var bottomDAO5: ItemDAO = ItemDAO()
        bottoms.document("bottom5").get().addOnSuccessListener { document ->
            var bottom5 = document?.toObject(ItemDAO::class.java)

            bottomDAO5.id = bottom5?.id
            bottomDAO5.name = bottom5?.name
            bottomDAO5.price = bottom5?.price
            bottomDAO5.description = bottom5?.description
            //result.add(topDAO5)
            //Log.d("exist", result.toString())
        }
        result.add(bottomDAO5)

        var bottomDAO6: ItemDAO = ItemDAO()
        bottoms.document("bottom6").get().addOnSuccessListener { document ->
            var bottom6 = document?.toObject(ItemDAO::class.java)

            bottomDAO6.id = bottom6?.id
            bottomDAO6.name = bottom6?.name
            bottomDAO6.price = bottom6?.price
            bottomDAO6.description = bottom6?.description
            //result.add(topDAO6)
            //Log.d("exist", result.toString())
        }
        result.add(bottomDAO6)

        var bottomDAO7: ItemDAO = ItemDAO()
        bottoms.document("bottom7").get().addOnSuccessListener { document ->
            var bottom7 = document?.toObject(ItemDAO::class.java)

            bottomDAO7.id = bottom7?.id
            bottomDAO7.name = bottom7?.name
            bottomDAO7.price = bottom7?.price
            bottomDAO7.description = bottom7?.description
            //result.add(topDAO7)
            //.d("exist", result.toString())
        }
        result.add(bottomDAO7)

        Log.d("exist", result.toString())
        return result
    }
}