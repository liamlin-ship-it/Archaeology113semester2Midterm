package Midterm;

import java.util.Scanner;

public class MidtermNin {
    // 時段常數定義
    public static final int EARLY_MORNING = 0;
    public static final int MORNING = 1;
    public static final int AFTERNOON = 2;
    public static final int EVENING = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.next();
        int hour = scanner.nextInt();

        // 呼叫determineTimeOfDay函數，根據小時數判斷當前時段
        int timeOfDay = determineTimeOfDay(hour);

        // 呼叫checkAgeThreshold函數，檢查年齡是否小於18
        boolean isYoung = checkAgeThreshold(age);

        // 根據年齡和時段，選擇適當的問候方式
        if (isYoung) {
            generateYoungGreeting(name, timeOfDay);
        } else {
            generateAdultGreeting(name, timeOfDay);
        }

        scanner.close();
    }

    // 這個函數根據小時數（0-23）判斷當前時段，返回對應的時段常數
    public static int determineTimeOfDay(int hour) {
        if (5 <= hour && hour <= 11){
            return MORNING;
        } else if (12 <= hour && hour <= 17) {
            return AFTERNOON;
        } else if (18 <= hour && hour <= 22) {
            return EVENING;
        } else {
            return EARLY_MORNING;
        }
    }

    // 這個函數檢查用戶的年齡是否小於18，參數是一個整數，返回值是一個boolean值
    public static boolean checkAgeThreshold(int age) {
        return age < 18;
    }

    // 這個函數為年輕使用者（<18歲）根據時段生成適當的問候語
    public static void generateYoungGreeting(String name, int time) {
        if (time == MORNING){
            System.out.println("Good morning, " + name);
        } else if (time == AFTERNOON) {
            System.out.println("Good afternoon, " + name);
        } else if (time == EVENING) {
            System.out.println("Good evening, " + name);
        }else {
            System.out.println("It's late, " + name + ", you should rest");
        }
    }

    // 這個函數為成年使用者（>=18歲）根據時段生成適當的問候語
    public static void generateAdultGreeting(String name, int time) {
        if (time == MORNING){
            System.out.println("Morning, " + name);
        } else if (time == AFTERNOON) {
            System.out.println("Afternoon, " + name);
        } else if (time == EVENING) {
            System.out.println("Evening, " + name);
        }else {
            System.out.println("Working late, " + name + ", you should rest");
        }
    }
}
