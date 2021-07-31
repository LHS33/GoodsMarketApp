package com.example.goodsmarketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    lateinit var menuBtn : ImageView
    lateinit var drawer : DrawerLayout
    lateinit var mainTopSearch : ImageView
    lateinit var mainTopAlert : ImageView
    lateinit var addBtn : ImageView
    lateinit var homeBtn : ImageView
    lateinit var myPageBtn : ImageView
    lateinit var mainBoxImage1 : ImageView
    lateinit var mainBoxText1 : TextView
    lateinit var mainBoxImage2 : ImageView
    lateinit var mainBoxText2 : TextView
    lateinit var mainBoxImage3 : ImageView
    lateinit var mainBoxText3 : TextView
    lateinit var mainBoxImage4 : ImageView
    lateinit var mainBoxText4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        menuBtn = findViewById<ImageView>(R.id.menuBtn)
        drawer = findViewById<DrawerLayout>(R.id.drawer)
        mainTopAlert = findViewById<ImageView>(R.id.mainTopAlert)
        mainTopSearch = findViewById<ImageView>(R.id.mainTopSearch)
        addBtn = findViewById<ImageView>(R.id.addBtn)
        homeBtn = findViewById<ImageView>(R.id.homeBtn)
        myPageBtn = findViewById<ImageView>(R.id.myPageBtn)
        mainBoxImage1 = findViewById<ImageView>(R.id.mainBoxImage1)
        mainBoxText1 = findViewById<TextView>(R.id.mainBoxText1)
        mainBoxImage2 = findViewById<ImageView>(R.id.mainBoxImage2)
        mainBoxText2 = findViewById<TextView>(R.id.mainBoxText2)
        mainBoxImage3 = findViewById<ImageView>(R.id.mainBoxImage3)
        mainBoxText3 = findViewById<TextView>(R.id.mainBoxText3)
        mainBoxImage4 = findViewById<ImageView>(R.id.mainBoxImage4)
        mainBoxText4 = findViewById<TextView>(R.id.mainBoxText4)
        menuBtn.setOnClickListener {
            drawer.openDrawer(GravityCompat.START)
        }
        mainTopAlert.setOnClickListener {
            Toast.makeText(this,"알림이 없습니다.", Toast.LENGTH_SHORT).show()
        }
        mainTopSearch.setOnClickListener {
            Toast.makeText(this,"검색 기능은 준비 중입니다.", Toast.LENGTH_SHORT).show()
        }
        /*addBtn.setOnClickListener {
            var intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }

        myPageBtn.setOnClickListener {
            val intent = Intent(this, MainActivity_page::class.java)
            startActivity(intent)
        }*/

        mainBoxImage1.setOnClickListener {
            var intent = Intent(this, PurchaseActivity::class.java)
            startActivity(intent)
        }
        mainBoxText1.setOnClickListener {
            var intent = Intent(this, PurchaseActivity::class.java)
            startActivity(intent)
        }
        mainBoxImage2.setOnClickListener {
            Toast.makeText(this,"판매 완료된 상풉입니다.", Toast.LENGTH_SHORT).show()
        }
        mainBoxText2.setOnClickListener {
            Toast.makeText(this,"판매 완료된 상풉입니다.", Toast.LENGTH_SHORT).show()
        }
        mainBoxImage3.setOnClickListener {
            Toast.makeText(this,"판매 완료된 상풉입니다.", Toast.LENGTH_SHORT).show()
        }
        mainBoxText3.setOnClickListener {
            Toast.makeText(this,"판매 완료된 상풉입니다.", Toast.LENGTH_SHORT).show()
        }
        mainBoxImage4.setOnClickListener {
            Toast.makeText(this,"판매 완료된 상풉입니다.", Toast.LENGTH_SHORT).show()
        }
        mainBoxText4.setOnClickListener {
            Toast.makeText(this,"판매 완료된 상풉입니다.", Toast.LENGTH_SHORT).show()
        }

    }

}