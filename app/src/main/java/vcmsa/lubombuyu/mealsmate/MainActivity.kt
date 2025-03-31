package vcmsa.lubombuyu.mealsmate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Code starts here
        // Find the start button
        val startButton = findViewById<Button>(R.id.startButton)

        // Set a click listener for the button
        startButton.setOnClickListener {
            // Start the Time Selection activity
            val intent = Intent(this, TimeSelection::class.java)
            startActivity(intent)
        }
    }
}
