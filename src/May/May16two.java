package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May16two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> rank = new ArrayList<>();

        String[] s = {"1st", "2nd", "3rd"};

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            num.add(n);
            rank.add(String.valueOf(n));
        }

        for (int i = 0; i < 3; i++) {
            int index = maxIndex((num));
            // set the biggest number to s
            rank.set(index, s[i]);
            // prevent maxIndex from getting the same number,
            // change that value to a very small number (-1)
            num.set(index, -1);
        }

        for (String string : rank) {
            System.out.print(string + " ");
        }
        scanner.close();
    }

    public static int maxIndex(ArrayList<Integer> num){
        int maxVal = num.getFirst();
        int maxIdx = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > maxVal) {
                maxVal = num.get(i);
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
