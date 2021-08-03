package com.example.goodsmarketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity_page : AppCompatActivity() {
    lateinit var drawer2: DrawerLayout
    lateinit var btnGoods: Button
    lateinit var btnList: Button
    lateinit var btncenter: Button
    lateinit var btnBack: ImageView
    lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        drawer2 = findViewById(R.id.drawer2)
        btnGoods = findViewById(R.id.btnGoods)
        btnList = findViewById(R.id.btnList)
        btncenter = findViewById(R.id.btncenter)
        btnBack = findViewById(R.id.btnBack)

        toolbar = findViewById(R.id.Toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val actionbar = supportActionBar!!

        //actionBar?.setDisplayShowCustomEnabled(true);
        //getSupportActionBar()?.setDisplayShowTitleEnabled(false);
        //actionBar?.setDisplayShowTitleEnabled(false);//기본 제목을 없애줍니다.
        //actionBar?.setDisplayHomeAsUpEnabled(false);
        toolbar.setTitle("")
        toolbar.setSubtitle("")

        //등록상품 버튼 눌렀을 때
        btnGoods.setOnClickListener {
            Toast.makeText(this, "준비 중인 기능입니다.", Toast.LENGTH_SHORT).show()
        }

        //제시상품 버튼 눌렀을 때
        btnList.setOnClickListener {
            Toast.makeText(this, "준비 중인 기능입니다.", Toast.LENGTH_SHORT).show()
        }

        //고객센터 버튼 눌렀을 때
        btncenter.setOnClickListener {
            Toast.makeText(this, "준비 중인 기능입니다.", Toast.LENGTH_SHORT).show()
        }


        //뒤로가기 버튼 눌렀을 때
        btnBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_reg, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            //로그인 버튼 눌렀을 때
            R.id.btnSignin -> {
                var intent = Intent(this, Login::class.java)
                startActivity(intent)
            }
            //회원가입 버튼 눌렀을 때
            R.id.btnSignup -> {
                var intent = Intent(this, MainActivity_reg::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}