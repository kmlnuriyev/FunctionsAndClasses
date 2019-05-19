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

        val name = nameText.text.toString()
        val surname = surnameText.text.toString()
        var age:Int? = null
        if (!ageText.text.toString().equals(""))
            age = parseInt(ageText.text.toString())


        val kamal = User(name, surname, age)
        headerText.text = "Welcome Mr. " + kamal.name + " " + kamal.surname

    }

}
