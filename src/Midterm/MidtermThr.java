package Midterm;

import java.util.Scanner;

public class MidtermThr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        String[] result = classifyNumbers(numbers);

        for (String output : result){
            System.out.print(output + " ");
        }
    }

    public static String[] classifyNumbers(int[] numbers) {
        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] % 2 == 0) {
                result[i] = "PosEven";
            }

            if (numbers[i] < 0 && numbers[i] % 2 == 0) {
                result[i] = "NegEven";
            }

            if (numbers[i] > 0 && numbers[i] % 2 != 0) {
                result[i] = "PosOdd";
            }

            if (numbers[i] < 0 && numbers[i] % 2 != 0) {
                result[i] = "NegOdd";
            }

            if (numbers[i] == 0) {
                result[i] = "Zero";
            }
        }
        return result;
    }
}
