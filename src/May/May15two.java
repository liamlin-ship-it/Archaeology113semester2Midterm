package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May15two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            numList.add(n);
        }

        int sum = 0;
        for (int i = 0; i < numList.size(); i++){
            if (numList.get(i) % 2 != 0){
                numList.set(i, numList.get(i) + 1);
            }
        }

        for (Integer integer : numList) {
            System.out.print(integer + " ");
            sum += integer;
        }

        System.out.println();
        System.out.println(sum);
    }
}
