package com.example.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
   fun openSignUpPage(view: View){
        val intent = Intent(this,SignupActivity::class.java)
        startActivity(intent)
    }

    fun signIn(){
        return
    }
}