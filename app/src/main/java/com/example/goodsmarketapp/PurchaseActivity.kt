package com.example.goodsmarketapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class PurchaseActivity : AppCompatActivity() {
    lateinit var menuBtn : ImageView
    lateinit var drawer : DrawerLayout
    lateinit var mainTopSearch : ImageView
    lateinit var mainTopAlert : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase)
        menuBtn = findViewById<ImageView>(R.id.menuBtn)
        drawer = findViewById<DrawerLayout>(R.id.drawer)
        mainTopAlert = findViewById<ImageView>(R.id.mainTopAlert)
        mainTopSearch = findViewById<ImageView>(R.id.mainTopSearch)
        menuBtn.setOnClickListener {
            drawer.openDrawer(GravityCompat.START)
        }
        mainTopAlert.setOnClickListener {
            Toast.makeText(this,"알림이 없습니다.", Toast.LENGTH_SHORT).show()
        }
        mainTopSearch.setOnClickListener {
            Toast.makeText(this,"검색 기능은 준비 중입니다.", Toast.LENGTH_SHORT).show()
        }
    }

}