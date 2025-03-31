package vcmsa.lubombuyu.mealsmate

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MorningMeal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_morning_meal)




        // Find meal images
        val acaiBowlImage = findViewById<ImageView>(R.id.acaiBowlImage)
        val avocadoToastImage = findViewById<ImageView>(R.id.avocadoToastImage)
        val bananaOatsImage = findViewById<ImageView>(R.id.bananaOatsImage)
        val omeletwithMushroomsBellPeppersImage = findViewById<ImageView>(R.id.OmeletwithMushroomsBellPeppersImage)
        val OvernightOatswithAlmondButterBlueberriesImage = findViewById<ImageView>(R.id.OvernightOatswithAlmondButterBlueberriesImage)
        val greekYogurtImage = findViewById<ImageView>(R.id.greekYogurtImage)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Setup click listeners for each image to display a Toast
        setupMealClickListener(acaiBowlImage, "Acai Bowl: A nutritious bowl with acai, bananas, and nuts.")
        setupMealClickListener(avocadoToastImage, "Avocado Toast: Crispy toast topped with fresh avocado and seasoning.")
        setupMealClickListener(bananaOatsImage, "Banana Oat Pancakes: Sweet and savory pancakes with banana oat topping.")
        setupMealClickListener(omeletwithMushroomsBellPeppersImage, "Omelet with Mushrooms and Bell Peppers: A comforting breakfast option.")
        setupMealClickListener(OvernightOatswithAlmondButterBlueberriesImage, "Overnight Oats with Almond Butter and Blueberries: A nutritious breakfast option.")
        setupMealClickListener(greekYogurtImage, "Greek Yogurt with Granola and Berries: A nutritious breakfast option.")

        // Button to go back to the previous activity
        btnBack.setOnClickListener {
            finish()
        }
    }
    // Code from chatgpt
    // Prompt: "Write a Kotlin function for an Android app that displays a custom Toast message.
    // The Toast should have a text size of 25sp, white text color.
    // It should appear at the bottom of the screen with a slight offset.
    // The function should accept a String message as a parameter and display it using Toast.LENGTH_LONG."
    // Helper function to reduce redundancy in Toast messages
    private fun setupMealClickListener(imageView: ImageView, message: String) {
        imageView.setOnClickListener {
            val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)

            // Create a TextView dynamically
            val textView = TextView(this)
            textView.text = message
            textView.textSize = 25f  // Set text size to 25sp
            textView.setPadding(20, 10, 20, 10) // Add padding

            // Set the TextView as the Toast view
            toast.view = textView
            toast.setGravity(Gravity.BOTTOM, 0, 100)  // Center the Toast on screen
            toast.show()
        }
    }


}
