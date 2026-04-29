package May;

import java.util.Scanner;

class Product{
    private final String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    // use 'void' because it updates the
    // object's internal price directly
    public void adjustPrice(int ratio){
        price = price + (price * ratio) / 100;
    }

    public String toString(){
        return "Name: " + name + ", Price: " + price;
    }
}

public class May8one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        int price1 = scanner.nextInt();
        int ratio1 = scanner.nextInt();
        Product p1 = new Product(name1, price1);
        p1.adjustPrice(ratio1);
        System.out.println(p1);

        String name2 = scanner.next();
        int price2 = scanner.nextInt();
        int ratio2 = scanner.nextInt();
        Product p2 = new Product(name2, price2);
        p2.adjustPrice(ratio2);
        System.out.println(p2);
    }
}
