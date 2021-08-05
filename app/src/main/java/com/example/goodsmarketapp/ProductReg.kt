package com.example.goodsmarketapp

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ProductReg : AppCompatActivity() {
    lateinit var regProductButton: Button
    lateinit var titleEdit: EditText
    lateinit var category1: Spinner
    lateinit var category2: Spinner
    lateinit var minimumEdit: EditText
    lateinit var fastEdit: EditText
    lateinit var writeEdit: EditText
    var list_of_1 = arrayOf("포토카드", "앨범", "공식 굿즈", "비공식 굿즈", "기타")
    var list_of_2 = arrayOf("1일", "2일", "3일", "4일", "5일", "6일", "일주일")
    lateinit var input_data1: String
    lateinit var input_data2: String

    //lateinit var myHelper : MainActivity_info.myDBHelper
    lateinit var dbManager: DBManager
    lateinit var sqlitedb: SQLiteDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_reg)

        regProductButton = findViewById(R.id.regProductButton)
        titleEdit = findViewById(R.id.titleEdit)
        category1 = findViewById(R.id.category1)
        category2 = findViewById(R.id.category2)
        minimumEdit = findViewById(R.id.minimumEdit)
        fastEdit = findViewById(R.id.fastEdit)
        writeEdit = findViewById(R.id.writeEdit)
        //myHelper = MainActivity_info.myDBHelper(this)

        dbManager = DBManager(this, "product", null, 1)
        // name 칸에 table 명을 넣어서 한 번 해보고 안되면 dbManager를 하나 더 선언해서 name 다르게



        //스피너 값 바뀔 때 동작하는 리스너

        input_data1 = ""
        input_data2 = ""

        category1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                input_data1 = list_of_1[position]
            }

        }

        category2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                input_data2 = list_of_2[position]
            }

        }

        //상품 등록 버튼 누름
        regProductButton.setOnClickListener {
            sqlitedb = dbManager.readableDatabase

            //카테고리 선택한 거도 DB에 Insert되게끔...
            sqlitedb.execSQL("INSERT INTO product VALUES ('"+titleEdit.text.toString()+"', '"+minimumEdit.text.toString()+"', '"+fastEdit.text.toString()+"'," +
                    " '"+writeEdit.text.toString()+"', '" + input_data1+"', '"+ input_data2+"');")
            Toast.makeText(this, "등록되었습니다.", Toast.LENGTH_SHORT).show()
            var intent2 = intent
            var id = intent2.getStringExtra("name")
            var intent = Intent(this, MainActivity::class.java)

            intent.putExtra("name", id)

            sqlitedb.close()

            startActivity(intent)

        }



        //카테고리 2개
        category1.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list_of_1)
        category2.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list_of_2)

        category1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                println("카테고리를 선택하세요.")
            }


        }

        }

    }