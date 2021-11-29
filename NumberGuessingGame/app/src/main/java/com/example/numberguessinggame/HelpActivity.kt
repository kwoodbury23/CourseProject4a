package com.example.numberguessinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

// The help activity displays the purpose and information about preferences
class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
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