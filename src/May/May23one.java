package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May23one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            numList.add(n);
        }

        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            if (i % 2 == 0){
                System.out.print(numList.get(i) + 1 + " ");
                sum += numList.get(i) + 1;
            }else {
                System.out.print(numList.get(i) + " ");
                sum += numList.get(i);
            }
        }

        System.out.println("\n" +sum);
        scanner.close();
    }
}
