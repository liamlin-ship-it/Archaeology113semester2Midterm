package Midterm;

import java.util.Scanner;

public class MidtermSev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++)
            prices[i] = scanner.nextInt();

        applyDiscount(prices);

        for (int i = 0; i < n; i++)
            System.out.print(prices[i] + " ");

        scanner.close();
    }

    public static void applyDiscount(int[] prices){
        for (int i = 0; i < prices.length; i++){
            if (100 <= prices[i] && prices[i] <= 500) {
                prices[i] = (int) (prices[i] * 0.9);
            }
            if (prices[i] > 500) {
                prices[i] = (int) (prices[i] * 0.8);
            }
        }
    }
}
