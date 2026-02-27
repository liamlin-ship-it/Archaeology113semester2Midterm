package March;

import java.util.Scanner;

public class Mar13one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++){
            num[i] = scanner.nextInt();
        }
        int getByte = scanner.nextInt();

        if (0 < getByte && getByte < n - 1){
            System.out.println(num[getByte]);
        }else {
            System.out.println("Index is out of range!");
        }
    }
}
