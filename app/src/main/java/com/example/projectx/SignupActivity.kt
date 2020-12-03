package com.example.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class SignupActivity : AppCompatActivity() {

    lateinit var editTextName: EditText
    lateinit var editTextEmail: EditText
    lateinit var editPassword: EditText
    lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        editTextName = findViewById(R.id.textName)
        editTextEmail = findViewById(R.id.textEmailSingIn)
        editPassword = findViewById(R.id.textPasswordSignIn)

    }

    private fun saveData(){

        val name = editTextName.text.toString().trim()
        val email = editTextEmail.text.toString().trim()
        val password = editPassword.text.toString().trim()

        if(name.isEmpty()){
            editTextName.error = "Please enter a name"
            return
        }

        if(email.isEmpty()){
            editTextEmail.error = "Please enter an email"
            return
        }



        if(password.isEmpty()){
            editPassword.error = "Please enter a password"
            return
        }



        val ref = FirebaseDatabase.getInstance().getReference("users")
        val userID = ref.push().key

        val userIDD = userID.toString()

        val User = Database(userIDD,name,email,password)

        ref.child(userIDD).setValue(User).addOnCompleteListener{
            Toast.makeText(applicationContext, "User saved succesfully", Toast.LENGTH_LONG).show()
        }

    }

    fun openMain(view: View){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun signUp(view: View){
       saveData()
    }
}