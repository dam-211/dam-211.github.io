package com.example.retrofitcero

import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        
        //Lanzo una corrutina para no bloquear la UI principal
        CoroutineScope(Dispatchers.IO).launch {

            try {
                val response = RetrofitClient.apiService.getEthPrice()
                val ethPrice = response.ethereum.usd

                Log.d("ETH", "El precio del ETH es de USD: $ethPrice")

            } catch (e: Exception) {

                Log.e("ETH", "Error al obtener la llamada a la API")
            }

        }

    }
}
