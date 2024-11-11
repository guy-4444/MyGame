import java.util.ArrayList;

public class Meal {

    private String name;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Meal(String name) {
        this.name = name;
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        String arr = "";

        // ToDo

        return "\nname=" + name + ' ' +
                ", ingredients=" + arr;
    }
}
