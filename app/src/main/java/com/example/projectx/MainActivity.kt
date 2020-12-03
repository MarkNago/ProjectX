package com.example.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import org.w3c.dom.Text
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


   fun openSignUpPage(view: View){
        val intent = Intent(this,SignupActivity::class.java)
        startActivity(intent)
    }

    fun signIn(view: View){
        return
    }
}