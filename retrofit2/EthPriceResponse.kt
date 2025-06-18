package com.example.retrofitcero




//Representa el JSOHN de nivel superior, que tiene una sola propiedad: ethereum
//Ethereum representa el objeto anidado dentro de etherum con el campo usd
//GSON le dice como convertir de JSON autoaticamente a clases

data class EthPriceResponse(

    val ethereum: Ethereum

)
