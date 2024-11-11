import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static ArrayList<Meal> meals = new ArrayList<>();
    private static HashMap<String, Integer> calorieMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Restaurant Game");


        Meal m1 = new Meal("Toast");
        m1.addIngredient("bread");
        m1.addIngredient("cheese");




        // add meals to




        calorieMap.put("bread", 100);

        for (Meal meal : meals) {
            int sumOfCalorie = calculateCalories(meal);
            System.out.println(meal + "\nCalories:" + sumOfCalorie);
        }

    }

    private static int calculateCalories(Meal meal) {


        return 0;
    }

}