package March;

import java.util.Scanner;

public class Mar13two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++){
            num[i] = scanner.nextInt();
        }

        int index = scanner.nextInt();
        int indexVal = scanner.nextInt();

        if (0 > index || 4 < index){
            System.out.println("Index is out of range!");
        }else {
            num[index] = indexVal;
            for (int i = 0; i < 5; i++){
                System.out.print(num[i] + " ");
            }
        }
    }
}
