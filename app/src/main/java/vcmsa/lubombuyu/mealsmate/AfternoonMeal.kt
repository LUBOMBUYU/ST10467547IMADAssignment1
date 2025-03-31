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

class AfternoonMeal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_afternoon_meal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Code starts here

        // Code explains how to go back to the previous activity
        val btnBack3 = findViewById<Button>(R.id.btnBack3)

        // This code is used to get the images as values so that when the user clicks on them,
        val BlackBeanQuesadillasImage = findViewById<ImageView>(R.id.BlackBeanQuesadillasImage)
        val StirFriedTofuWithRiceImage = findViewById<ImageView>(R.id.StirFriedTofuWithRiceImage)
        val WholeWheatPastawithPestoCherryTomatoesImage = findViewById<ImageView>(R.id.WholeWheatPastawithPestoCherryTomatoesImage)
        val VeganBbqRceandBeansBowlmage = findViewById<ImageView>(R.id.VeganBbqRceandBeansBowlmage)

        // This code sends the user back to the previous activity
        btnBack3.setOnClickListener {
            finish()
        }

        // This code displays a toast message for Black Bean Quesadillas.
        BlackBeanQuesadillasImage.setOnClickListener {
            showToast("Black Bean Quesadillas: Crispy tortillas filled with seasoned black beans, melted cheese, and flavorful spices ")
        }
        // This code displays a toast message for Stir-Fried Tofu with Rice.
        StirFriedTofuWithRiceImage.setOnClickListener {
            showToast("Stir-Fried Tofu with Rice : A savory mix of crispy tofu, vegetables, and aromatic sauces served over steamed rice.")
        }

        // This code displays a toast message for Whole Wheat Pasta with Pesto & Cherry Tomatoes.
        WholeWheatPastawithPestoCherryTomatoesImage.setOnClickListener {
            showToast("Whole Wheat Pasta with Pesto & Cherry Tomatoes : Hearty whole wheat pasta tossed in fresh basil pesto with juicy cherry tomatoes.")
        }

        // This code displays a toast message for Vegan BBQ Rice and Beans Bowl.
        VeganBbqRceandBeansBowlmage.setOnClickListener {
            showToast("Vegan BBQ Rice and Beans Bowl : A smoky, protein-packed bowl of BBQ-flavored beans over rice with fresh toppings.")
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

        // Set the TextView as the Toast view
        toast.view = textView
        toast.setGravity(Gravity.BOTTOM, 0, 0)  // Center the Toast on screen
        toast.show()
    }
}