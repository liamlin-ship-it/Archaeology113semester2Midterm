package Midterm;

import java.util.Scanner;

public class MidtermEig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] colors = new String[n];

        // 讀取 n 個顏色字串，並將其存儲在 colors 陣列中
        for (int i = 0; i < n; i++) {
            colors[i] = scanner.next();
        }

        // 呼叫 convert 方法轉換每個顏色，轉換的規則是 "RED" 變為 "#FF0000"，"BLUE" 變為 "#0000FF"
        // convert 方法的參數是一個字串，返回值也是一個字串，會更新 colors 陣列中的對應字串
        for (int i = 0; i < n; i++) {
            colors[i] = convert(colors[i]);
        }

        // 印出轉換後的每個顏色代碼
        for (int i = 0; i < n; i++) {
            System.out.print(colors[i] + " ");
        }

        scanner.close();
    }

    // 這個方法轉換一個顏色字串，轉換的規則是 "RED" 變為 "#FF0000"，"BLUE" 變為 "#0000FF"
    public static String convert(String colors) {
        if (colors.equals("RED")){
            return "#FF0000";
        }else {
            return "#0000FF";
        }
    }
}
