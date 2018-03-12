package com.example.aunogarafat.cryptocurrencyapp

/**
 * Created by aunogarafat on 3/12/18.
 * Project name CryptoCurrencyApp
 */
data class CryptoModel(
        val id: String,
        val name: String,
        val symbol: String,
        val price_usd: String,
        val percent_change_1h: String,
        val percent_change_24h: String,
        val percent_change_7d: String

) {

}
