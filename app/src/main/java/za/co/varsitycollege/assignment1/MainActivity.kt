package za.co.varsitycollege.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val TimeOfTheDay =findViewById<EditText>(R.id.TimeOfTheDay)
        val MealSuggestions =findViewById<TextView>(R.id.MealSuggestions)
        val btnCheck =findViewById<Button>(R.id.btnCheck)
        val ResetButton = findViewById<Button>(R.id.ResetButton)
    }

}

