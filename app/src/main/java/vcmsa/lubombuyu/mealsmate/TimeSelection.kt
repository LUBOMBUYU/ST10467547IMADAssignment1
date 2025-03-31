package vcmsa.lubombuyu.mealsmate

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class TimeSelection : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_selection)

        // Code starts here
        // Get references to the Edit text and Buttons
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            // Retrieve the time entered by the user and trim whitespace
            val timeEntered = editTextTime.text.toString().trim()

            // Check the entered time and navigate to the appropriate activity
            // If the time is not recognized, display a toast message
            // If the time is entered in caps then it will be converted to lower case

            when {
                // if the time entered is morning then it will navigate to the morning activity
                timeEntered.equals("morning", ignoreCase = true) ||
                        timeEntered.equals("breakfast", ignoreCase = true) ||
                        timeEntered.equals("morning meal", ignoreCase = true) -> {
                    startActivity(Intent(this, MorningMeal::class.java))
                }
                // if the time entered is mid-morning then it will navigate to the mid-morning activity
                timeEntered.equals("mid-morning", ignoreCase = true) ||
                        timeEntered.equals("brunch", ignoreCase = true) ||
                        timeEntered.equals("mid-morning meal", ignoreCase = true) -> {
                    startActivity(Intent(this, MiddleMorningMeal::class.java))
                }
                // if the time entered is lunch then it will navigate to the lunch activity
                timeEntered.equals("lunch", ignoreCase = true) -> {
                    startActivity(Intent(this, AfternoonMeal::class.java))
                }
                // if the time entered is dinner then it will navigate to the dinner activity
                timeEntered.equals("dinner", ignoreCase = true) ||
                        timeEntered.equals("evening", ignoreCase = true) ||
                        timeEntered.equals("evening meal", ignoreCase = true) -> {
                    startActivity(Intent(this, EveningMeal::class.java))
                }
                // if the time entered is dessert then it will navigate to the dessert activity
                timeEntered.equals("dessert", ignoreCase = true) -> {
                    startActivity(Intent(this, DessertMeal::class.java))
                }
                else -> {
                    // If the entered time is not recognized, display a toast message
                    Toast.makeText(this, "Please enter a valid time of day", Toast.LENGTH_LONG).show()
                }
            }
        }

        // Code explains how to go back to the previous activity
        val btnBack1 = findViewById<Button>(R.id.btnBack1)
        btnBack1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        // Code explains how to clear the edit text
        val btnReset = findViewById<Button>(R.id.btnReset)
        btnReset.setOnClickListener {
            editTextTime.text.clear()
        }
    }

}
