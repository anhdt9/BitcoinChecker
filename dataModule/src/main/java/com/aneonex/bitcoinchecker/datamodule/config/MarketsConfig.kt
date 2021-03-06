package com.aneonex.bitcoinchecker.datamodule.config

import com.aneonex.bitcoinchecker.datamodule.model.Market
import com.aneonex.bitcoinchecker.datamodule.model.market.*
import java.util.*

object MarketsConfig {
    @kotlin.jvm.JvmField
    val MARKETS = LinkedHashMap<String, Market>()
    private fun addMarket(market: Market) {
        MARKETS[market.key] = market
    }

    init {
        addMarket(Bitstamp())
        addMarket(Mercado())
        addMarket(Kraken())
        addMarket(Bitfinex())
        addMarket(Okcoin())
        addMarket(Cryptsy())
        addMarket(Coinbase())
//        addMarket(Vircurex())
//        addMarket(Fxbtc())
        addMarket(Bter())
//        addMarket(Justcoin())
        addMarket(Btcturk())
//        addMarket(Coinse())
//        addMarket(Campbx())
        addMarket(TheRock())
        addMarket(CexIO())
//        addMarket(Virtex())
        addMarket(Huobi())
        addMarket(VaultOfSatoshi())
//        addMarket(CoinMarketIO())
        addMarket(McxNOW())
//        addMarket(CryptoTrade())
        addMarket(MintPal())
        addMarket(CoinJar())
        addMarket(Poloniex())
//        addMarket(Winkdex())
        addMarket(BitX())
        addMarket(CCex())
        addMarket(Bitorado())
        addMarket(CryptoRush())
        addMarket(CoinDesk())
        addMarket(Koinim())
//        addMarket(FybSE())
        addMarket(FybSG())
        addMarket(Prelude())
        addMarket(BitKonan())
        addMarket(BitTrex())
        addMarket(Comkort())
        addMarket(Bit2c())
        addMarket(CryptoAltex())
        addMarket(BtcMarkets())
        addMarket(Bleutrade())
        addMarket(ShareXcoin())
//        addMarket(Unisend())
        addMarket(BitcoinVenezuela())
        addMarket(Korbit())
        addMarket(CoinTree())
        addMarket(Cryptonit())
        addMarket(LakeBTC())
        addMarket(BitMaszyna())
//        addMarket(Zaydo())
        addMarket(AllCoin())
        addMarket(Ripio())
//        addMarket(DolarBlueNet())
        addMarket(CoinSwap())
        addMarket(Paymium())
        addMarket(Bitso())
        addMarket(Cryptoine())
        addMarket(BitcoinToYou())
        addMarket(BitexLa())
        addMarket(ItBit())
        addMarket(BitcoinCoId())
        addMarket(HitBtc())
//        addMarket(CleverCoin())
        addMarket(BitBay())
        addMarket(QuadrigaCX())
        addMarket(CoinMateIO())
        addMarket(Buttercoin())
//        addMarket(CoinTraderNet())
        addMarket(LocalBitcoins())
        addMarket(Cryptopia())
        addMarket(Igot())
//        addMarket(Mexbt())
        addMarket(Vaultoro())
        addMarket(BitxCom())
        addMarket(BtcBox())
//        addMarket(BtcXIndia())
        addMarket(Uphold())
        addMarket(YoBit())
        addMarket(ShapeShift())
//        addMarket(BitoEx())
        addMarket(OKCoinFutures())
        //		addMarket(new FoscEx());
//        addMarket(CoinSecure())
        addMarket(Dashcurex())
        addMarket(Quoine())
        addMarket(Livecoin())
        addMarket(Gemini())
        addMarket(Coinapult())
        addMarket(Btc38())
        addMarket(ETHEXIndia())
        addMarket(GateCoin())
        addMarket(Liqui())
        addMarket(ChileBit())
        addMarket(SurBitcoin())
        addMarket(VBtc())
        addMarket(Urdubit())
        addMarket(NegocieCoins())
        addMarket(BitMEX())
        addMarket(BitFlyer())
        addMarket(BitFlyerFX())
        addMarket(Coinone())
        addMarket(Bithumb())
        addMarket(Coinsph())
        addMarket(Bl3p())
        addMarket(SurBtc())
        addMarket(CoinFloor())
        addMarket(Lykke())
        addMarket(Coinnest())
        addMarket(Braziliex())
        addMarket(Abucoins())
        addMarket(Zebpay())
        addMarket(Paribu())
        addMarket(SatoshiTango())
        addMarket(Koinex())
        //		addMarket(new Unocoin());
        addMarket(BlinkTrade())
        addMarket(Exmo())
        addMarket(Binance())
        addMarket(Kucoin())
        addMarket(BitcoinTrade())
        addMarket(OmniTrade())
        addMarket(Coinome())
        addMarket(Nocks())
        addMarket(BitoPro())
    }
}