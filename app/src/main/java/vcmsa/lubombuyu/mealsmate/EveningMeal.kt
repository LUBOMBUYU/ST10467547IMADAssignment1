package vcmsa.lubombuyu.mealsmate

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat

@Suppress("DEPRECATION")
class EveningMeal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_evening_meal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // This code is used to get the images as values so that when the user clicks on them,
        // This code when click goes back to the previous activity.
        val btnBack4 = findViewById<Button>(R.id.btnBack4)
        btnBack4.setOnClickListener {
            finish()
        }


        // This code is used to get the images as values so that when the user clicks on them,
        val BeefandBeanschiliImage = findViewById<ImageView>(R.id.BeefandBeanschiliImage)
        val rilledSteakMashPotatoGreenBeansImage = findViewById<ImageView>(R.id.rilledSteakMashPotatoGreenBeansImage)
        val GrilledFishwithGarlicandBasImage = findViewById<ImageView>(R.id.GrilledFishwithGarlicandBasImage)
        val ChickpeaandSpinachCurrywithRiceImage = findViewById<ImageView>(R.id.ChickpeaandSpinachCurrywithRiceImage)


        // This code displays a toast message for Beef and Beans Chili.
        BeefandBeanschiliImage.setOnClickListener {
            showToast("Beef and Beans Chili : A hearty and spicy stew made with tender beef, beans, tomatoes, and bold seasonings.")
        }

        // This code displays a toast message for Grilled Steak, Mashed Potatoes, Green Beans.
        rilledSteakMashPotatoGreenBeansImage.setOnClickListener {
            showToast("Grilled Steak, Mashed Potatoes, Green Beans : Juicy grilled steak served with creamy mashed potatoes and fresh green beans for a balanced meal.")
        }

        // This code displays a toast message for Grilled Fish with Garlic and Basil.
        GrilledFishwithGarlicandBasImage.setOnClickListener {
            showToast("Grilled Fish with Garlic and Basil : Light and flavorful fish fillet grilled with aromatic garlic and fresh basil for a delicious taste.")
        }

        // This code displays a toast message for Chickpea and Spinach Curry with Rice.
        ChickpeaandSpinachCurrywithRiceImage.setOnClickListener {
            showToast("Chickpea and Spinach Curry with Rice : A rich and comforting curry made with chickpeas, spinach, and fragrant spices, served over steamed rice.")
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