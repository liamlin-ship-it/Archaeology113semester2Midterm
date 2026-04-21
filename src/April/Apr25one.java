package April;

import java.util.Scanner;

public class Apr25one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.print(target + " has " + Count(num, target));
    }

    public static int Count(int[] num, int target){
        int count = 0;
        for (int element : num) {
            if (element == target){
                count++;
            }
        }
        return count;
    }
}
