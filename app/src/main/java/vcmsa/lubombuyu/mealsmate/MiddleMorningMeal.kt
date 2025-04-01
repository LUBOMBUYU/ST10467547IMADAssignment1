package vcmsa.lubombuyu.mealsmate

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


@Suppress("LocalVariableName", "DEPRECATION")
class MiddleMorningMeal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_middle_morning_meal)



        // Code starts here
        // This code is used to get the images as values so that when the user clicks on them,
        val btnBack2 = findViewById<Button>(R.id.btnBack2)
        val berrySmoothieImage = findViewById<ImageView>(R.id.BerrysmoothiesImage)
        val hummusImage = findViewById<ImageView>(R.id.HummusandVeggiesticksImage)
        val oatmealCookiesImage = findViewById<ImageView>(R.id.OatMealCookiesImage)
        val TrailMixImage = findViewById<ImageView>(R.id.TrailMixImage)

        // This code sends the user back to the previous activity
        btnBack2.setOnClickListener {
            finish()
        }

        // This code displays a toast message for Black Bean Quesadillas.
        berrySmoothieImage.setOnClickListener {
            showToast("Berry Smoothies: A refreshing blend of mixed berries, yogurt, and honey.")
        }

        // This code displays a toast message for Stir-Fried Tofu with Rice.
        hummusImage.setOnClickListener {
            showToast("Hummus and Veggie Sticks: A creamy hummus dip paired with fresh vegetable sticks.")
        }

        // This code displays a toast message for Oat meal Cookies.
        oatmealCookiesImage.setOnClickListener {
            showToast("Oatmeal Cookies: Soft and chewy cookies made with wholesome oats, cinnamon, and raisins.")
        }

        // This code displays a toast message for Trail Mix.
        TrailMixImage.setOnClickListener {
           showToast("Trail Mix: A crunchy mix of roasted nuts, dried fruits, and chocolate chips.")
         }
    }

    // Code from chatgpt
    // Prompt: "Write a Kotlin function for an Android app that displays a custom Toast message.
    // The Toast should have a text size of 25sp, white text color.
    // It should appear at the bottom of the screen with a slight offset.
    // The function should accept a String message as a parameter and display it using Toast.LENGTH_LONG."
    // Helper function to reduce redundancy in Toast messages
    private fun showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)

        // Create a TextView dynamically
        val textView = TextView(this)
        textView.text = message
        textView.textSize = 25f  // Set text size to 25sp
        textView.setPadding(20, 10, 20, 10) // Add padding
        textView.setTextColor(ContextCompat.getColor(this, R.color.blue))

        // Set the TextView as the Toast view
        toast.view = textView
        toast.setGravity(Gravity.BOTTOM, 0, 0)  // Center the Toast on screen
        toast.show()
    }
}
