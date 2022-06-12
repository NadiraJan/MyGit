package be.intecbrussel.mapOpdracht11;
import java.util.HashMap;import java.util.LinkedHashMap;import java.util.Map;
import java.util.TreeMap;

public class MapApp {
    public static void main(String[] args) {

        Map<Coin, Integer> wallet = new TreeMap<>();

        wallet.put(Coin.FIVE_CENT, 6);
        wallet.put(Coin.TEN_CENT, 23);
        wallet.put(Coin.TWENTY_CENT, 20);
        wallet.put(Coin.FIFTY_CENT, 3);
        wallet.put(Coin.ONE_EURO, 5);
        wallet.put(Coin.ONE_EURO, 7);
        wallet.put(Coin.TWO_EURO, 1);

        double totalValueOfWallet = 0;

        for (Coin coin : wallet.keySet()) {

            System.out.println("For " + coin + " I have this many: " + wallet.get(coin));

            System.out.println("adding following amount: " + (coin.getMonetaryValue() *
                    wallet.get(coin)));
            totalValueOfWallet += coin.getMonetaryValue() * wallet.get(coin);
        }

        System.out.println("I'm reach, I have this much: " + totalValueOfWallet);
    }
}

