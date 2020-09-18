package com.example.simplenotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.and
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val passwordEdit = findViewById<EditText>(R.id.editTextTextPassword)
        val emailEdit = findViewById<EditText>(R.id.editTextTextEmailAddress3)
        val enterButton = findViewById<Button>(R.id.button_enter)

        val intent = Intent(this@LoginActivity, NotesActivity::class.java)
        enterButton.setOnClickListener {
            if (emailEdit.text.toString().length == 0) emailEdit.error = "Nothing entered"
            if (passwordEdit.text.toString()!="qwerty123") passwordEdit.error = "Wrong password"
            if (emailEdit.text.toString().length != 0 &&
            passwordEdit.text.toString()=="qwerty123")
                startActivity(intent)
        }
    }
}