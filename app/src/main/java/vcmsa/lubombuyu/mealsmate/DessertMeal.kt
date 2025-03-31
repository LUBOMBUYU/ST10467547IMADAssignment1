package vcmsa.lubombuyu.mealsmate

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class DessertMeal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dessert_meal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Code starts here
        // Code explains how to go back to the previous activity
        val btnBack6 = findViewById<Button>(R.id.btnBack6)
        btnBack6.setOnClickListener {
            finish()
        }

        // This code is used to get the images as values so that when the user clicks on them,
        // They display a toast with the name of the dish and a short description of it.
        val pannaCottaBerriesSweetenedCreamImage = findViewById<ImageView>(R.id.PannaCottaBerriesSweetenedCreamImage)
        val chocolateCoveredStrawberriesImage = findViewById<ImageView>(R.id.ChocolateCoveredStrawberriesImage)
        val bakedAppleSlicesImage = findViewById<ImageView>(R.id.BakedAppleSlicesImage)
        val soupBreadImage = findViewById<ImageView>(R.id.SoupBreadImage)


        // This code displays a toast message for Panna Cotta with Berries and cream.
        pannaCottaBerriesSweetenedCreamImage.setOnClickListener {
            showToast("Panna Cotta with Berries : A silky-smooth dessert topped with fresh, juicy berries for a perfect balance of sweetness and tartness.")
        }

        // This code displays a toast message for Chocolate Covered Strawberries.
        chocolateCoveredStrawberriesImage.setOnClickListener {
            showToast("Chocolate Covered Strawberries : Juicy, ripe strawberries dipped in rich, velvety chocolate for a delightful blend of sweetness and freshness.")
        }

        // This code displays a toast message for Baked Apple Slices.
        bakedAppleSlicesImage.setOnClickListener {
            showToast("Baked Apple Slices : Warm, tender apple slices baked with cinnamon and a touch of honey for a comforting and naturally sweet treat.")
        }

        // This code displays a toast message for Soup with Bread.
        soupBreadImage.setOnClickListener {
            showToast("Soup with Bread : A hearty, warming soup served with freshly baked bread, perfect for soaking up every flavorful spoonful.")
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
        textView.setTextColor(ContextCompat.getColor(this, R.color.white))

        // Set the TextView as the Toast view
        toast.view = textView
        toast.setGravity(Gravity.BOTTOM, 0, 100)  // Center the Toast on screen
        toast.show()
    }
}