package com.example.functionsandclasses

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.functionsandclasses.Model.User
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saveClick(view:View) {


        val kamal = User(nameText.text.toString(), surnameText.text.toString(), parseInt(ageText.text.toString()))
        headerText.text = "Welcome Mr. " + kamal.name + " " + kamal.surname

    }

}
