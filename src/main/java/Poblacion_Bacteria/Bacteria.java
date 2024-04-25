package Poblacion_Bacteria;

public class Bacteria {
    private String name;
    private String startDate;
    private String endDate;
    private int initialBacteriaCount;
    private int temperature;
    private String luminosity;
    private int initialFood;
    private int foodIncreaseDay;
    private int foodIncreaseAmount;
    private int finalFood;

    public Bacteria(String name, String startDate, String endDate, int initialBacteriaCount, int temperature, String luminosity, int initialFood, int foodIncreaseDay, int foodIncreaseAmount, int finalFood) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.initialBacteriaCount = initialBacteriaCount;
        this.temperature = temperature;
        this.luminosity = luminosity;
        this.initialFood = initialFood;
        this.foodIncreaseDay = foodIncreaseDay;
        this.foodIncreaseAmount = foodIncreaseAmount;
        this.finalFood = finalFood;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getInitialBacteriaCount() {
        return initialBacteriaCount;
    }

    public void setInitialBacteriaCount(int initialBacteriaCount) {
        this.initialBacteriaCount = initialBacteriaCount;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(String luminosity) {
        this.luminosity = luminosity;
    }

    public int getInitialFood() {
        return initialFood;
    }

    public void setInitialFood(int initialFood) {
        this.initialFood = initialFood;
    }

    public int getFoodIncreaseDay() {
        return foodIncreaseDay;
    }

    public void setFoodIncreaseDay(int foodIncreaseDay) {
        this.foodIncreaseDay = foodIncreaseDay;
    }

    public int getFoodIncreaseAmount() {
        return foodIncreaseAmount;
    }

    public void setFoodIncreaseAmount(int foodIncreaseAmount) {
        this.foodIncreaseAmount = foodIncreaseAmount;
    }

    public int getFinalFood() {
        return finalFood;
    }

    public void setFinalFood(int finalFood) {
        this.finalFood = finalFood;
    }
}
