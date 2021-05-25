package com.example.kotlin1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1_2.extension.loadImage
import com.example.kotlin1_2.extension.showToast
import com.example.kotlin1_2.extension.visible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val myArrayList = arrayListOf(
            "https://i.pinimg.com/originals/94/1a/16/941a1638848c06d3d83139f2ba267c9d.jpg",
            "https://proprikol.ru/wp-content/uploads/2020/10/kartinki-ne-grusti-1.jpg",
            "https://avatarko.ru/img/kartinka/33/multfilm_lyagushka_32117.jpg",
            "https://www.meme-arsenal.com/memes/8c4efb9bdbe32514cd7b64ec5e2e1fd1.jpg",
            "https://starwars-galaxy.ru/800/600/https/pristor.ru/wp-content/uploads/2019/08/Картинки-на-аву-в-ВК-для-девушек-крутые-и-нарисованные-21.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        btn_random.setOnClickListener {
            val index = Random.nextInt(0, myArrayList.size)
            img_main.loadImage(myArrayList[index])
            showToast(index.toString())
        }
        btn_submit.setOnClickListener {
            myArrayList.add(edit_txt.text.trim().toString())
            img_main.loadImage(edit_txt.text.trim().toString())
        }
    }
}