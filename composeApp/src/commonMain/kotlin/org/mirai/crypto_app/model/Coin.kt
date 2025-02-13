package org.mirai.crypto_app.model


/*
*
* id: "bitcoin",
symbol: "btc",
name: "Bitcoin",
image: "https://coin-images.coingecko.com/coins/images/1/large/bitcoin.png?1696501400",
current_price: 97635,
market_cap: 1937234190109,
market_cap_rank: 1,
fully_diluted_valuation: 1937236046879,
total_volume: 45049696438,
high_24h: 98098,
low_24h: 94120,
price_change_24h: 1859.56,
price_change_percentage_24h: 1.94158,
market_cap_change_24h: 38279158812,
market_cap_change_percentage_24h: 2.0158,
circulating_supply: 19823381,
total_supply: 19823400,
max_supply: 21000000,
ath: 108786,
ath_change_percentage: -10.20294,
ath_date: "2025-01-20T09:11:54.494Z",
atl: 67.81,
atl_change_percentage: 143960.83572,
atl_date: "2013-07-06T00:00:00.000Z",
roi: null,
last_updated: "2025-02-12T23:50:00.584Z"
*
* */


data class Coin(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String,
    val current_price: Int,
    val market_cap: Long,
    val market_cap_rank: Int,
    val fully_diluted_valuation: Long,
    val total_volume: Long,
    val high_24h: Int,
    val low_24h: Int,
    val price_change_24h: Double,
    val price_change_percentage_24h: Double,
    val circulating_supply: Long,
    val total_supply: Long,
    val max_supply: Long,
    val ath: Long,
    val ath_change_percentage: Double,
    val ath_date: String,
    val atl: Double,
    val atl_change_percentage: Double,
    val atl_date: String,
    val roi: Double? = 0.0,
    val last_updated: String
)

data class CoinList(
    val coins : List<Coin>
)
