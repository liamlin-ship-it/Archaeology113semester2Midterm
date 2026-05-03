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
        }
        feed -= 25;
    }

    public void buyFeed(){
        if (buyTimes != 0){
            feed += 100;
            buyTimes--;
        }else {
            System.out.println("No enough feed!!");
            System.exit(0);
        }
    }

    public int remainFeed(){
        // if buyTimes is 0, then 0 * 100 is just 0
        return feed + (buyTimes * 100);
    }
}

public class May9thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int feedTime = scanner.nextInt();
        int buyTime = scanner.nextInt();

        Feed feed = new Feed(name);

        feed.setBuyTime(buyTime);
        for (int i = 0; i < feedTime; i++){
            feed.feedOnce();
        }

        System.out.println("I have a(n) " + feed.getAnimal());
        System.out.println("Remain Feed: " + feed.remainFeed());
    }
}
