package com.example.hackormyth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable

data class Flashcard(
    val statement: String,
    val isHack: Boolean,
    val explanation: String
) : Serializable

class Main3Activity : AppCompatActivity() {

    private val flashcards = listOf(
        Flashcard("Putting your phone in rice fixes water damage.", false, "Myth: Rice doesn’t absorb water effectively."),
        Flashcard("Freezing jeans kills bacteria instead of washing.", false, "Myth: Freezing doesn’t kill bacteria."),
        Flashcard("Using vinegar can clean glass streak-free.", true, "Hack: Vinegar is a natural cleaner."),
        Flashcard("Drinking coffee helps you sober up quickly.", false, "Myth: Coffee doesn’t speed up alcohol metabolism."),
        Flashcard("Microwaving a sponge kills bacteria.", true, "Hack: Microwaving damp sponges kills germs."),
        Flashcard("Eating carrots improves night vision.", false, "Myth: This was WWII propaganda."),
        Flashcard("Using baking soda removes fridge odors.", true, "Hack: Baking soda neutralizes smells."),
        Flashcard("Cracking your knuckles causes arthritis.", false, "Myth: No scientific link."),
        Flashcard("Lemon juice can remove stains from clothes.", true, "Hack: Citric acid helps break down stains."),
        Flashcard("Goldfish have a 3-second memory.", false, "Myth: Goldfish can remember for months.")
    )

    private var currentIndex = 0
    private var score = 0

    private lateinit var statementText: TextView
    private lateinit var feedbackText: TextView
    private lateinit var hackButton: Button
    private lateinit var mythButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        statementText = findViewById(R.id.statementText)
        feedbackText = findViewById(R.id.feedbackText)
        hackButton = findViewById(R.id.hackButton)
        mythButton = findViewById(R.id.mythButton)
        nextButton = findViewById(R.id.nextButton)

        loadQuestion()

        hackButton.setOnClickListener { checkAnswer(true) }
        mythButton.setOnClickListener { checkAnswer(false) }

        nextButton.setOnClickListener {
            currentIndex++
            if (currentIndex < flashcards.size) {
                loadQuestion()
            } else {
                val intent = Intent(this, Main4Activity::class.java).apply {
                    putExtra("score", score)
                    putExtra("flashcards", ArrayList(flashcards))
                }
                startActivity(intent)
                finish()
            }
        }
    }

    private fun loadQuestion() {
        val flashcard = flashcards[currentIndex]
        statementText.text = flashcard.statement
        feedbackText.text = ""
    }

    private fun checkAnswer(answer: Boolean) {
        val flashcard = flashcards[currentIndex]
        if (answer == flashcard.isHack) {
            score++
            feedbackText.text = "HOORAY! That is a hack!"
        } else {
            feedbackText.text = "OOPS! That is a Myth!"
        }
    }
}

