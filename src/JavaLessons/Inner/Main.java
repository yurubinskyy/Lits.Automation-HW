package Inner;

public class Main {
    public static void main(String[] args) {
        Feed lion = new Feed();
//        Feed goat = new Feed();
        Feed.Food food = lion.new Food();
//        goat.setFood(food);
        food.setType("Meat");
        food.setWeight(1.2);
        lion.setAnimal("Lion");
        lion.setFood(food);
        lion.feed();
        lion.getFood().validate();

    }
}
