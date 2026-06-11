package Final;

import java.util.ArrayList;
import java.util.Scanner;

class StudentIdList extends ArrayList<Integer> {

    public StudentIdList(String input){
        String[] splitNum = input.split("-");
        for (String eachNum : splitNum){
            // 'this' means the ArrayList itself
            this.add(Integer.parseInt(eachNum));
        }
    }

    public String combine(String sign){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.get(i));
            if (i < this.size() - 1){
                sb.append(sign);
            }
        }
        return sb.toString();
    }
}

public class nin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String sign = scanner.next();

        StudentIdList list = new StudentIdList(input);

        System.out.println("Combined: " + list.combine(sign));
        list.sort(null);
        System.out.println("Sorted: " + list.combine(sign));
        list.removeFirst();
        System.out.println("Removed first: " + list.combine(sign));
    }
}
