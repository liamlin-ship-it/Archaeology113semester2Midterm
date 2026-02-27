package Midterm;

import java.util.Scanner;

public class MidtermFiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result = calculateFrequencyRange(numbers);

        System.out.println(result);
    }

    public static int calculateFrequencyRange(int[] numbers){
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    count++;
                }
            }
            if (count > max){
                max = count;
            }

            if (count < min) {
                min = count;
            }
        }
        return max - min;
    }
}
