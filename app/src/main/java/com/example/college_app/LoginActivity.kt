package com.example.college_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentTransaction
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity() {
    private lateinit var firebaseAuth : FirebaseAuth
    private lateinit var editTextTextEmailAddress : EditText
    private lateinit var editTextTextPassword : EditText
    private lateinit var logbutton : AppCompatButton

    private lateinit var button :AppCompatButton
    private lateinit var button2 :AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        firebaseAuth = FirebaseAuth.getInstance()

        editTextTextEmailAddress =findViewById(R.id.editTextTextEmailAddress)
        editTextTextPassword =findViewById(R.id.editTextTextPassword)
        logbutton =findViewById(R.id.logbutton)

        logbutton.setOnClickListener {
            val email = editTextTextEmailAddress.text.toString()
            val password = editTextTextPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener{
                    if (it.isSuccessful){
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }else {
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, Resgister_Activity::class.java)
            startActivity(intent)
        }
        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, Resgister_Activity::class.java)
            startActivity(intent)
        }

        /*  logbutton.setOnClickListener {

              val email = editTextTextEmailAddress.text.toString().trim()
              val password = editTextTextPassword.text.toString().trim()

              if (email.isEmpty()) {
                  editTextTextEmailAddress.error = "Email_ID Required"
                  return@setOnClickListener
              }


              else if (password.isEmpty()) {
                  editTextTextPassword.error = "Password is Required"
                  return@setOnClickListener
              } else {

                  Toast.makeText(this, "Login is successful", Toast.LENGTH_SHORT).show()
                  val intent = Intent(this, MainActivity::class.java)
                  startActivity(intent)
              }
          }
  */
            val noAccountTextView: TextView = findViewById(R.id.noAccountTextView)
            noAccountTextView.setOnClickListener {
                Toast.makeText(this, "Redirecting", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Resgister_Activity::class.java)
                startActivity(intent)
            }

        }


    }
