package com.example.tugas5

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var username = "iqbal"
    var pasword = "1234"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = findViewById<EditText>(R.id.user)
        val pass = findViewById<EditText>(R.id.pas)
        val login = findViewById<Button>(R.id.btn)
        val regis = findViewById<TextView>(R.id.registrasi)
        val google = findViewById<ImageView>(R.id.google)
        val twiter = findViewById<ImageView>(R.id.twiter)
        val facebook = findViewById<ImageView>(R.id.facebook)

        login.setOnClickListener {
            if (user.getText().toString().equals(username)&&pass.getText().toString().equals(pasword)){
                Toast.makeText(applicationContext,"Login Berhasil", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,pag ::class.java));
            }else if(user.text.isEmpty()){
                Toast.makeText(applicationContext,"Email kosong silahkan masukkan email anda!",
                    Toast.LENGTH_SHORT).show()
            }else if(pass.text.isEmpty()){
                Toast.makeText(applicationContext,"Pasword kosong silahkan masukkan password anda!",
                    Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(applicationContext,"data yang anda masukkan salah", Toast.LENGTH_SHORT).show()
        }
        google.setOnClickListener{
            val intenimplisit = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            startActivity(intenimplisit)
        }
        twiter.setOnClickListener{
            val intenimplisit = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/?lang=en-id"))
            startActivity(intenimplisit)
        }
        facebook.setOnClickListener{
            val intenimplisit = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
            startActivity(intenimplisit)
        }
    }
}