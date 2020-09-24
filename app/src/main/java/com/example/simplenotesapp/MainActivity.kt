package com.example.simplenotesapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {

    private lateinit var mainFragment: NotesListFragment
    private lateinit var activeFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainFragment = NotesListFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.container, mainFragment).commitNow()


    }


}