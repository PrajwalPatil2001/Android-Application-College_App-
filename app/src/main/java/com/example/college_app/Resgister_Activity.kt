package com.example.college_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class Resgister_Activity : AppCompatActivity() {

    private lateinit var firebaseAuth : FirebaseAuth
    private lateinit var etname : EditText
    private lateinit var etemail : EditText
    private lateinit var etpass : EditText

    private lateinit var button3 : AppCompatButton
    private lateinit var button4 : AppCompatButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resgister)

        val createacc: Button = findViewById(R.id.createacc)
        firebaseAuth = FirebaseAuth.getInstance()
        etname = findViewById(R.id.etname)
        etemail = findViewById(R.id.etemail)
        etpass = findViewById(R.id.etpass)
        createacc.setOnClickListener {

            val name= etname.text.toString()
            val email = etemail.text.toString()
            val password = etpass.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                    if (it.isSuccessful){
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else {
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }

        }


        button3= findViewById(R.id.button3)
        button3.setOnClickListener {
            Toast.makeText(this,"Enter the Fields",Toast.LENGTH_SHORT).show()
        }

        button4= findViewById(R.id.button4)
        button4.setOnClickListener {
            Toast.makeText(this,"Enter the Fields",Toast.LENGTH_SHORT).show()
        }





        /* val createacc: Button = findViewById(R.id.createacc)
            createacc.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            */
        }
    }
