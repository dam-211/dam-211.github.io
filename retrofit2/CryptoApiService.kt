package com.example.retrofitcero

import retrofit2.http.GET
import retrofit2.http.Query

// https://api.coingecko.com/api/v3/simple/price?ids=ethereum&vs_currencies=usd

//La URL con los parámetros necesarios
//Especificar com hablar con la API

//

interface CryptoApiService {


    @GET("simple/price")
    suspend fun getEthPrice( //se ejecuta en una corrutina sin bloquear el hilo principal de la app
        @Query("ids") ids: String ="ethereum",
        @Query("vs_currencies") vsCurrencies: String = "usd"
    ): EthPriceResponse //Retroft devuelve un objeto de TIPO EthPriceResponse (es decir el data class principal que que dentro tiene el ortro data class que tiene el usd)

}
