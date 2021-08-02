package com.example.goodsmarketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity_page : AppCompatActivity() {
    lateinit var btnGoods: Button
    lateinit var btnList: Button
    lateinit var btncenter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        btnGoods = findViewById(R.id.btnGoods)
        btnList = findViewById(R.id.btnList)
        btncenter = findViewById(R.id.btncenter)

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
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_reg, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId) {
            //로그인 옵션 눌렀을 때
            /*R.id.action_signin -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }*/

            //회원가입 옵션 눌렀을 때
            R.id.action_signup -> {
                var intent=Intent(this, MainActivity_reg::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}