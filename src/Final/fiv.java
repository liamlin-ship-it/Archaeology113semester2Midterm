package Final;

import java.util.ArrayList;
import java.util.Scanner;

class Dish {
    private final String name; // name of the dish
    private final int calories; // calories of the dish

    public Dish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String toString() {
        return "Name: " + name + ", Calories: " + calories + ", Type: " + getType();
    }

    public String getType() {
        if (name.contains("Salad") || name.contains("Vegetable")) {
            return "Healthy";
        } else if (name.contains("Burger") || name.contains("Pizza")) {
            return "FastFood";
        } else if (name.contains("Soup") || name.contains("Rice")) {
            return "Comfort";
        } else if (name.contains("Cake") || name.contains("Ice")) {
            return "Dessert";
        } else {
            return "Other";
        }
    }
}

class Restaurant{
    ArrayList<Dish> dishes = new ArrayList<>();

    //public Restaurant(){
        //dishes = new ArrayList<>();
    //}

    public ArrayList<Dish> searchForType(String type, int lowerCalories, int higherCalories){
        ArrayList<Dish> result = new ArrayList<>();

        for (Dish dish : dishes){
            if (dish.getType().equals(type) && dish.getCalories() >= lowerCalories && dish.getCalories() <= higherCalories){
                result.add(dish);
            }
        }
        return result;
    }

    public void add(Dish dish) {
        if (!dish.getType().equals("Other") && dish.getCalories() > 0){
            dishes.add(dish);
        }
    }
}

public class fiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create a new Restaurant object, where the menu contains some dishes
        Restaurant restaurant = new Restaurant();

        // Allow the user to add 5 dishes to the restaurant
        for (int i = 1; i <= 5; i++) {
            // Example input: Caesar Salad;150
            // (name: Caesar Salad, calories: 150)
            String input = scanner.nextLine();
            String name = input.split(";")[0];
            int calories = Integer.parseInt(input.split(";")[1]);

            // create a new Dish object with the given name and calories
            restaurant.add(new Dish(name, calories));
        }

        // Allow the user to search for dishes in a specific type and calorie range
        // Example input: Healthy;100;200
        // (type: Healthy, lower calories: 100, upper calories: 200)
        String input = scanner.nextLine();
        String type = input.split(";")[0];
        int lowerCalories = Integer.parseInt(input.split(";")[1]);
        int upperCalories = Integer.parseInt(input.split(";")[2]);

        ArrayList<Dish> result = restaurant.searchForType(type, lowerCalories, upperCalories);
        if (result.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Dish dish : result) {
                System.out.println(dish);
            }
        }
    }
}
