package com.example.retrofitcero

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Crea una instancia de Retrofit configurada con la URL de base


object RetrofitClient {

    //lazy--> Se va a inicilizar solo la primera vez que se llama, ahorrando memoria y rrecursos
    val apiService: CryptoApiService by lazy {

        Retrofit.Builder()
            .baseUrl("https://api.coingecko.com/api/v3/")
            .addConverterFactory(GsonConverterFactory.create()) //Traduce ese JSON a objeto kotlin
            .build()
            .create(CryptoApiService::class.java) //se genera una implementación concreta de la interfaz

    }
