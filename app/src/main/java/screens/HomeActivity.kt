package screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.routecourses.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navigationButtonAndroid : Button = findViewById(R.id.androidButton)

        navigationButtonAndroid.setOnClickListener{
            val intent = Intent(this, AndroidActivity::class.java)
            startActivity(intent)
        }

        val navigationButtonFullStack : Button = findViewById(R.id.fullstackButton)

        navigationButtonFullStack.setOnClickListener{
            val intent = Intent(this, FullstackActivity::class.java)
            startActivity(intent)
        }

        val navigationButtonIos : Button = findViewById(R.id.iosButton)

        navigationButtonIos.setOnClickListener{
            val intent = Intent(this, IosActivity::class.java)
            startActivity(intent)
        }
    }
}