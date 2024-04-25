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

    
}
