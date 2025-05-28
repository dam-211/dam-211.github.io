package ar.edu.ifts18.ciclodevidafragment

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "ActivityMainCV"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mensaje = savedInstanceState?.getString("mensaje")
        Log.d(TAG, "El mensaje recuperdo es: $mensaje")


        Log.d(TAG, "estoy en el onCreate del AM")
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) {

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, CicloVidaFragment())
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")

      
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    fun isEmulator(): Boolean {
        val fingerprint = android.os.Build.FINGERPRINT
        val model = android.os.Build.MODEL
        val manufacturer = android.os.Build.MANUFACTURER
        val brand = android.os.Build.BRAND
        val device = android.os.Build.DEVICE
        val product = android.os.Build.PRODUCT

        return (fingerprint.startsWith("generic") ||
                fingerprint.lowercase().contains("virtual") ||
                model.contains("google_sdk") ||
                model.contains("Emulator") ||
                model.contains("Android SDK built for x86") ||
                manufacturer.contains("Genymotion") ||
                (brand.startsWith("generic") && device.startsWith("generic")) ||
                "google_sdk" == product)
    }


    
    }
}
