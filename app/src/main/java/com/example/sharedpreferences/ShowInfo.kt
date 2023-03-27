package com.example.sharedpreferences

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sharedpreferences.R.id.txtUsuario

class ShowInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_info)

        val user = findViewById<TextView>(R.id.textUser)
        val pass = findViewById<TextView>(R.id.textPass)

        var miBundle:Bundle? = this.intent.extras

        if (miBundle != null) {
            user.text = "User: ${miBundle.getString("User")}"
            pass.text = "Pass: ${miBundle.getString("Pass")}"
        }

        val  btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener{onClick()}
    }

    private  fun onClick(){
        finish()
    }


}