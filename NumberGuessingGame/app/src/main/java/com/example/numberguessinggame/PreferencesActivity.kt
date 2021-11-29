package com.example.numberguessinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_secondary.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferences.*

// Preferences allows the user to view wins and change the difficulty
class PreferencesActivity : AppCompatActivity() {
    override fun onCreate(sharedPreferences: Bundle?) {
        super.onCreate(sharedPreferences)
        setContentView(R.layout.activity_preferences)
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

    // Sets the game to easy
    fun makeEasy(view: View?) {
        val diff = 25
        val Intent = Intent(this, SecondaryActivity::class.java)
        Intent.putExtra("difficulty", diff)
    }

    // Sets the game to normal
    fun makeNormal(view: View?) {
        val diff = 50
        val Intent = Intent(this, SecondaryActivity::class.java)
        Intent.putExtra("difficulty", diff)
    }

    // Sets the game to hard
    fun makeHard(view: View?) {
        val diff = 100
        val Intent = Intent(this, SecondaryActivity::class.java)
        Intent.putExtra("difficulty", diff)

    }

    // Displays user wins
    fun wins(view: View?) {
        val wins = intent.getStringExtra("wins", )
            winsText!!.setText("User wins: " + wins)
    }
}