package com.example.simplenotesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.simplenotesapp.MainNotes.NotesListFragment


class MainActivity : AppCompatActivity() {

/*
    private lateinit var mainFragment: NotesListFragment
    private lateinit var activeFragment: Fragment
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*

        mainFragment    = NotesListFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.container, mainFragment).commitNow()

*/

    }


}