package Poblacion_Bacteria;

import java.io.Serializable;

public class Bacteria implements Serializable{
    private String name;
    private String startDate;
    private String endDate;
    private int initialBacteriaCount;
    private double temperature;
    private double luminosity;
    private double initialFood;
    private int foodIncreaseDay;
    private double foodIncreaseAmount;
    private double finalFood;

    public Bacteria(String name, String startDate, String endDate, int initialBacteriaCount, double temperature, String luminosity, double initialFood, int foodIncreaseDay, double foodIncreaseAmount, double finalFood) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.initialBacteriaCount = initialBacteriaCount;
        this.temperature = temperature;
        this.luminosity = Double.parseDouble(luminosity);
        this.initialFood = initialFood;
        this.foodIncreaseDay = foodIncreaseDay;
        this.foodIncreaseAmount = foodIncreaseAmount;
        this.finalFood = finalFood;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getInitialBacteriaCount() {
        return initialBacteriaCount;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public double getInitialFood() {
        return initialFood;
    }

    public int getFoodIncreaseDay() {
        return foodIncreaseDay;
    }

    public double getFoodIncreaseAmount() {
        return foodIncreaseAmount;
    }

    public double getFinalFood() {
        return finalFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setInitialBacteriaCount(int initialBacteriaCount) {
        this.initialBacteriaCount = initialBacteriaCount;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public void setInitialFood(double initialFood) {
        this.initialFood = initialFood;
    }

    public void setFoodIncreaseDay(int foodIncreaseDay) {
        this.foodIncreaseDay = foodIncreaseDay;
    }

    public void setFoodIncreaseAmount(double foodIncreaseAmount) {
        this.foodIncreaseAmount = foodIncreaseAmount;
    }

    public void setFinalFood(double finalFood) {
        this.finalFood = finalFood;
    }
    
}
