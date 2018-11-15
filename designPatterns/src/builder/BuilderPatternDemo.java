package builder;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg meal");
        vegMeal.showItems();
        System.out.println("Total cost:"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("nonVeg meal");
        nonVegMeal.showItems();
        System.out.println("Total cost:"+nonVegMeal.getCost());
    }
}
