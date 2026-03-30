package com.example.corassocialspark

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.timeInput)
        val button = findViewById<Button>(R.id.btnSuggest)
        val result = findViewById<TextView>(R.id.resultText)

        button.setOnClickListener {

            val message = when (userInput) {
                "morning" -> "🌞Send a good morning message to a family member"
                "mid-morning" -> "🙏Thank a colleague with a quick message"
                "afternoon" -> "\uD83E\uDD2A Share a funny meme with a friend"
                "afternoon snack time" -> "\uD83D\uDE18 Send a thinking of you message"
                "dinner" -> "☎\uFE0F Call a friend for a 5-minute catch-up"
                "night, after dinner" -> "\uD83C\uDF1D Leave a thoughtful comment on a post"

                "" -> "Please enter a time of day😏"

                else -> "Try: morning, mid-morning, afternoon, dinner, or night"
            }
            result.text = message
            }
        }

        }
