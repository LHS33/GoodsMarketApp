package com.example.goodsmarketapp

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity_reg : AppCompatActivity() {

    lateinit var dbManager: DBManager
    lateinit var sqlitedb: SQLiteDatabase

    lateinit var btnRegist: Button
    lateinit var btnVer: Button
    lateinit var btnCode: Button
    lateinit var btnBack: ImageView
    lateinit var edtName: EditText
    lateinit var edtNum: EditText
    lateinit var edtAddress: EditText
    lateinit var password: EditText
    lateinit var password_verify: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_reg)

        btnRegist = findViewById(R.id.btnRegister)
        btnVer = findViewById(R.id.btnVer)
        btnCode = findViewById(R.id.btnCode)
        btnBack = findViewById(R.id.btnBack)
        edtName = findViewById(R.id.edtName)
        edtNum = findViewById(R.id.edtNum)
        edtAddress = findViewById(R.id.edtAddress)
        password = findViewById(R.id.password)
        password_verify = findViewById(R.id.password_verify)

        dbManager = DBManager(this, "personnelDB", null, 1)

        //인증 버튼 눌렀을 때
        btnVer.setOnClickListener {
            Toast.makeText(this, "준비 중인 기능입니다", Toast.LENGTH_SHORT).show()
        }

        //우편번호 버튼 눌렀을 때
        btnCode.setOnClickListener {
            Toast.makeText(this, "준비 중인 기능입니다", Toast.LENGTH_SHORT).show()
        }

        //뒤로가기 버튼 눌렀을 때
        btnBack.setOnClickListener {
            var intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //가입하기 버튼 눌렀을 때 DB에 정보 넘어가고 다시 마이페이지로 돌아옴
        btnRegist.setOnClickListener {
            var str_name: String = edtName.text.toString()
            var str_pw: String = password.text.toString()
            var str_pw_re : String = password_verify.text.toString()
            var str_num: String = edtNum.text.toString()
            var str_address: String = edtAddress.text.toString()

            // 유저가 항목을 다 채우지 않았을 경우
            if(str_name.isEmpty() || str_pw.isEmpty() || str_num.isEmpty() || str_address.isEmpty()) {
                Toast.makeText(this, "항목을 모두 채워주세요", Toast.LENGTH_SHORT).show()
            }

            //비밀번호가 일치할 경우
            else if (str_pw == str_pw_re) {

                sqlitedb = dbManager.writableDatabase
                sqlitedb.execSQL("INSERT INTO personnel VALUES ('" +str_name+"', '" + str_pw +"', " +str_num+", '" +str_address+"')")
                sqlitedb.close()

                // 회원가입 성공 토스트 메세지 띄우기
                Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()

                // 마이페이지 화면으로 이동
                val intent = Intent(this, MainActivity_page::class.java)
                startActivity(intent)
            }

            //비밀번호가 다를 경우
            else {
                Toast.makeText(this, "비밀번호 불일치", Toast.LENGTH_SHORT).show()
            }
        }
    }
}