package com.example.hackormyth

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Main4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val scoreText: TextView = findViewById(R.id.scoreText)
        val feedbackText: TextView = findViewById(R.id.feedbackText)
        val reviewButton: Button = findViewById(R.id.reviewButton)

        val score = intent.getIntExtra("score", 0)
        val flashcards = intent.getSerializableExtra("flashcards") as? ArrayList<Flashcard> ?: arrayListOf()

        scoreText.text = "Your Score: $score/${flashcards.size}"

        feedbackText.text = if (score >= 5) {
            "YOU KNOW YOUR STUFF!"
        } else {
            "BETTER LUCK NEXT TIME!"
        }

        reviewButton.setOnClickListener {
            val builder = StringBuilder()
            for (card in flashcards) {
                builder.append("${card.statement}\n")
                builder.append("Answer: ${if (card.isHack) "Hack" else "Myth"}\n")
                builder.append("Explanation: ${card.explanation}\n\n")
            }
            feedbackText.text = builder.toString()
        }
    }
}





