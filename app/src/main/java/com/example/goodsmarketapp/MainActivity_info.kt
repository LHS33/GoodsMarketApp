package com.example.goodsmarketapp

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import java.nio.file.Files.move

class MainActivity_info : AppCompatActivity() {
    lateinit var edtNameResult : EditText

    lateinit var btnGoods: Button
    lateinit var btnList: Button
    lateinit var btncenter: Button
    lateinit var btnBack: ImageView
    lateinit var toolbar : Toolbar
    lateinit var sqlDB : SQLiteDatabase

    //lateinit var dbManager: DBManager
    //lateinit var myHelper : myDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_info)

        /*sqlDB = myHelper.readableDatabase
        var cursor: Cursor
        cursor = sqlDB.rawQuery("SELECT * FROM personnel WHERE name = '" +name +"';", null)

        var strNames = " 님"
        strNames += cursor.getString(0)

        edtNameResult.setText(strNames)
        cursor.close()
        sqlDB.close()*/


        edtNameResult = findViewById(R.id.edtNameResult)
        btnGoods = findViewById(R.id.btnGoods)
        btnList = findViewById(R.id.btnList)
        btncenter = findViewById(R.id.btncenter)
        btnBack = findViewById(R.id.btnBack)
        //myHelper = myDBHelper(this)

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
        menuInflater.inflate(R.menu.menu_logout, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            //로그아웃 버튼 눌렀을 때
            R.id.btnLogout -> {
                var intent = Intent(this, MainActivity_page::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    /*inner class myDBHelper(context: Context) : SQLiteOpenHelper(context, "personnel", null, 1) {
        override fun onCreate(db: SQLiteDatabase?) {
            db!!.execSQL("CREATE TABLE personnel (name text, pw text, num text, address text)")
        }

        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            db!!.execSQL("DROP TABLE IF EXISTS personnel")
            onCreate(db)
        }
    }*/
}