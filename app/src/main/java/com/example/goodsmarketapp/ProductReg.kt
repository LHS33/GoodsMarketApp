package com.example.goodsmarketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ProductReg : AppCompatActivity() {
    lateinit var camera: ImageView
    lateinit var regProductButton: Button
    lateinit var titleEdit: EditText
    lateinit var category1: Spinner
    lateinit var category2: Spinner
    lateinit var minimumEdit: EditText
    lateinit var fastEdit: EditText
    lateinit var writeEdit: EditText
    var list_of_1 = arrayOf("포토카드", "앨범", "공식 굿즈", "비공식 굿즈", "기타")
    var list_of_2 = arrayOf("1일", "2일", "3일", "4일", "5일", "6일", "일주일")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_reg)

        camera = findViewById(R.id.camera)
        regProductButton = findViewById(R.id.regProductButton)
        titleEdit = findViewById(R.id.titleEdit)
        category1 = findViewById(R.id.category1)
        category2 = findViewById(R.id.category2)
        minimumEdit = findViewById(R.id.minimumEdit)
        fastEdit = findViewById(R.id.fastEdit)
        writeEdit = findViewById(R.id.writeEdit)

        //상품 등록 버튼 누름 -> 글 등록하고 메인 화면으로 돌아감
        regProductButton.setOnClickListener {
            //글 등록하는 문구 아직

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


        //뭔가 해보려다 안 된 쓰레기 흔적
        var spinner : Spinner
        var sData = resources.getStringArray(R.array.my_array)
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sData)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                imgArr
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

    }
}