package com.example.simplenotesapp.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.simplenotesapp.MainActivity
import com.example.simplenotesapp.R

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val passwordEdit = findViewById<EditText>(R.id.et_password)
        val emailEdit = findViewById<EditText>(R.id.et_email)
        val enterButton = findViewById<Button>(R.id.btn_enter)


/*        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)*/

        val intent = Intent(this@LoginActivity, MainActivity::class.java)
        enterButton.setOnClickListener {
            if (emailEdit.text.toString().length == 0) emailEdit.error = "Nothing entered"
            if (passwordEdit.text.toString()!="qwerty123") passwordEdit.error = "Wrong password"
            if (emailEdit.text.toString().length != 0 &&
            passwordEdit.text.toString()=="qwerty123")
                startActivity(intent)
        }
    }
}