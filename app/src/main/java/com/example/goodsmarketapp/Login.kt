package com.example.goodsmarketapp

import android.content.Context
import android.content.Intent
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        nameEdit = findViewById(R.id.nameEdit)
        passwordEdit = findViewById(R.id.passwordEdit)
        regButton = findViewById(R.id.regButton)
        loginButton = findViewById(R.id.loginButton)
        noAccount = findViewById(R.id.noAccount)

        inner class myDBHelper(context: Context) : SQLiteOpenHelper(context, "personnelDB", null, 1) {
            override fun onCreate(db: SQLiteDatabase?) {

            }

            override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

            }
        }



        //회원가입 버튼 누름 -> 회원가입 페이지로
        regButton.setOnClickListener {
            var intent = Intent(this, PersonnelReg::class.java)
            startActivity(intent)

        }

        //로그인 버튼 누름 -> 둘 다 맞으면 닉네임or실명님, 어서오세요 Toast 하고 메인으로, 틀리면 없는 이름이거나 비번입니다 Toast
        loginButton.setOnClickListener {
            if() {
                if() { //둘 다 맞음. MainActivity 쪽에서 이름 비번 받아오는 코드 넣어야 합니다. (실전프로젝트 part4 6:30의 두 줄 참고)
                    var intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("name", nameEdit.text.toString())
                    intent.putExtra("password", passwordEdit.text.toString())
                    Toast.makeText(this, "$nameEdit" + "님, 어서오세요.", Toast.LENGTH_SHORT).show()
                    startActivity(intent)

                } else { //이름은 맞는데 비번 틀림

                    Toast.makeText(this, "없는 이름/비밀번호입니다.", Toast.LENGTH_SHORT).show()
                }
            } else { //이름부터 틀림

                Toast.makeText(this, "없는 이름/비밀번호입니다.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}