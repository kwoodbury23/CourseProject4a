package com.example.numberguessinggame


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


// This program allows the user to enter a name for the game
class MainActivity : AppCompatActivity() {
    override fun onCreate(sharedPreferences: Bundle?) {
        super.onCreate(sharedPreferences)
        setContentView(R.layout.activity_main)
    }
    // Allows the user to go to the second activity
    fun sendMessage(view: View?) {
        val Intent = Intent(this, SecondaryActivity::class.java)
        // Allows the second activity to display user's name
        Intent.putExtra("name", editName.text.toString())
        startActivity(Intent)
    }

    // Goes to main
    fun goToMain(view: View?) {
        val Intent = Intent(this, MainActivity::class.java)
        startActivity(Intent)
    }

    // Goes to game
    fun goToGame(view: View?) {
        val Intent = Intent(this, SecondaryActivity::class.java)
        startActivity(Intent)
    }

    // Goes to preferences
    fun goToPreferences(view: View?) {
        val Intent = Intent(this, PreferencesActivity::class.java)
        startActivity(Intent)
    }

    // Goes to help
    fun goToHelp(view: View?) {
        val Intent = Intent(this, HelpActivity::class.java)
        startActivity(Intent)
    }

}