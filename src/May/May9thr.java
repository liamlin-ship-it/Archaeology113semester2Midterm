package May;

import java.util.Scanner;

class Feed{
    private final String animal;
    private int feed;
    private int buyTimes;

    public Feed(String animal){
        this.animal = animal;
        feed = 500;
    }

    public String getAnimal(){
        return animal;
    }

    public void setBuyTime(int buyTime){
        buyTimes = buyTime;
    }

    public void feedOnce(){
        if (feed - 25 < 25){
            this.buyFeed();
        }else {
            feed -= 25;
        }
    }

    public void buyFeed(){
        if (buyTimes != 0){
            feed += 100;
            buyTimes--;
        }else {
            System.out.println("No enough feed!!");
        }
    }

    public void remainFeed(){
        if (buyTimes == 0){
            buyTimes++;
        }
        System.out.println("Remain Feed: " + feed);
    }
}

public class May9thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int feedTimes = scanner.nextInt();
        int buyTime = scanner.nextInt();

        Feed feed = new Feed(name);

        feed.setBuyTime(buyTime);
        for (int i = 0; i < feedTimes; i++){
            feed.feedOnce();
        }

        if (buyTime == 0){
            System.out.println("I have a(n) " + feed.getAnimal());
            feed.remainFeed();
        }else {
            feed.buyFeed();
        }
    }
}
