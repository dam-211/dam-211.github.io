package ar.edu.ifts18.fragment3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, DisplayFragment())
            .commit()
    }

}
