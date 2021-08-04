package com.example.goodsmarketapp

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    lateinit var nameEdit: EditText
    lateinit var passwordEdit: EditText
    lateinit var regButton: Button
    lateinit var loginButton: Button
    lateinit var noAccount: TextView

    lateinit var dbManager: DBManager
    lateinit var sqlitedb: SQLiteDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        nameEdit = findViewById(R.id.nameEdit)
        passwordEdit = findViewById(R.id.passwordEdit)
        regButton = findViewById(R.id.regButton)
        loginButton = findViewById(R.id.loginButton)
        noAccount = findViewById(R.id.noAccount)

        dbManager = DBManager(this, "personnel", null, 1)


        //회원가입 버튼 누름 -> 회원가입 페이지로
        regButton.setOnClickListener {
            var intent = Intent(this, MainActivity_reg::class.java)
            startActivity(intent)

        }

        //로그인 버튼 누름 -> 맞으면 Toast 하고 메인으로, 틀리면 없는 이름이거나 비번입니다 Toast
        loginButton.setOnClickListener {

            sqlitedb = dbManager.readableDatabase


            var cursor: Cursor

            var name = nameEdit.text.toString()
            var password = passwordEdit.text.toString()


            cursor = sqlitedb.rawQuery("SELECT * FROM personnel WHERE name = '$name' AND pw = '$password';", null)

                if(cursor.count != 0) { //둘 다 맞음. 여기 담은 이름 비번 받아오는 코드는 실전프로젝트 part4 6:30의 두 줄 참고
                    var intent = Intent(this, MainActivity_info::class.java)
                    intent.putExtra("name", nameEdit.text.toString())
                    intent.putExtra("password", passwordEdit.text.toString())
                    Toast.makeText(this, "$name" + "님, 어서오세요.", Toast.LENGTH_SHORT).show()
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "없는 이름 또는 비밀번호입니다.", Toast.LENGTH_SHORT).show()
                    var intent = Intent(this, Login::class.java)
                    startActivity(intent)
                }


        }

    }

}