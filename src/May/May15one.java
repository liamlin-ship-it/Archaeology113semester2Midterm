package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May15one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        int sum = 0;
        // scanner.hasNextInt() checks if the
        // next input can be interpreted as an integer
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            numList.add(n);
        }

        // iterate through the list to
        // calculate the alternating sum
        for (int i = 0; i < numList.size(); i++) {
            if (i % 2 == 0){
                sum += numList.get(i);
            }else {
                sum -= numList.get(i);
            }
        }

        System.out.println("Alternating sum: " + sum);
    }
}
