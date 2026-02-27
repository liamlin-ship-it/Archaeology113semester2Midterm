package Midterm;

import java.util.Scanner;

public class MidtermSev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int[] newPrices = applyDiscount(prices);

        for (int i = 0; i < n; i++) {
            System.out.print(newPrices[i] + " ");
        }
        scanner.close();
    }

    public static int[] applyDiscount(int[] prices) {
        int[] myPrice = new int[prices.length];

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < 100){
                myPrice[i] = prices[i];
            } else if (100 <= prices[i] && prices[i] <= 500) {
                myPrice[i] = (int) (prices[i] * 0.9);
            } else if (500 < prices[i]) {
                myPrice[i] = (int) (prices[i] * 0.8);
            }
        }
        return myPrice;
    }
}
