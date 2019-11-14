package com.example.pbl_ndb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("shoppingmall")

        buttonTop.setOnClickListener {
            val topIntent = Intent(this, TopActivity::class.java)
            startActivity(topIntent)
        }

        buttonBottom.setOnClickListener {
            val bottomIntent = Intent(this, BottomActivity::class.java)
            startActivity(bottomIntent)
        }

        buttonOuter.setOnClickListener {
            val outerIntent = Intent(this, OuterActivity::class.java)
            startActivity(outerIntent)
        }

        // 검색 기능
        var search: EditText = findViewById(R.id.SearchEditText)
        search.getText()
        val topRef = db.collection("tops")
        val bottomoRef = db.collection("bottoms")
        val outerRef = db.collection("outers")

        //가격이 5000원인 옷 검색
        topRef.whereEqualTo("price", 5000).get().addOnSuccessListener { documents ->
            for (document in documents) {

            }
        }
        bottomoRef.whereEqualTo("price", 5000)
        outerRef.whereEqualTo("price", 5000)

    }
}
