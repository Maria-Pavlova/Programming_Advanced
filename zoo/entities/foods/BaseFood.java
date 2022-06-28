package zoo.entities.foods;

public abstract class BaseFood implements Food{
    private int calories;
    private double price;

    public BaseFood(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getCalories() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
