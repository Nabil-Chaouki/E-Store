package com.example.store

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var email = findViewById<TextInputEditText>(R.id.email)
        var password = findViewById<TextInputEditText>(R.id.password)

        btnLogin.setOnClickListener {

            when {
                TextUtils.isEmpty(email.text.toString().trim{ it <= ' '}) -> {
                    Toast.makeText(
                        this@LoginActivity,
                        "L'email est vide",
                        Toast.LENGTH_SHORT).show()
                }

                TextUtils.isEmpty(password.text.toString().trim{ it <= ' '}) -> {
                    Toast.makeText(
                        this@LoginActivity,
                        "Le mot de passe est vide",
                        Toast.LENGTH_SHORT).show()
                }
                else -> {

                    val email1:String = email.text.toString().trim{ it <= ' '}
                    val password1:String = password.text.toString().trim{ it <= ' '}

                    FirebaseAuth.getInstance().signInWithEmailAndPassword(email1,password1)
                        .addOnCompleteListener {  task ->

                            if (task.isSuccessful) {

                                Toast.makeText(
                                    this@LoginActivity,
                                    "You are logged in successfully",
                                    Toast.LENGTH_SHORT
                                ).show()

                                val intent =
                                    Intent(this@LoginActivity,MainActivity::class.java)
                                intent.flags =
                                    Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                intent.putExtra("user_id",FirebaseAuth.getInstance().currentUser!!.uid)
                                intent.putExtra("email_id",email1)
                                startActivity(intent)
                                finish()
                            } else {

                                Toast.makeText(
                                    this@LoginActivity,
                                    "Mauvais login / mot de passe",
                                    Toast.LENGTH_SHORT

                                ).show()

                            }

                        }









                }
            }
        }
    }
}