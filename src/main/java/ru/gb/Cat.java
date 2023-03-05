package ru.gb;

public class Cat {

    private String name;
    private volatile int appetite;
    private volatile int satiety;

    public Cat(String name, int appetite) {
        
        this.name = name;
        this.appetite = appetite;

        Thread backgroundSatietyManagement = new Thread(() -> {
            while (true){
                satiety--;
                try {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        backgroundSatietyManagement.setDaemon(true);
        backgroundSatietyManagement.start();
    }

    public void eat(Plate plate) {
        if (satiety > 0) {
            plate.decreaseFood(appetite - satiety);
        }
    }

    public void makeHungry() {
        satiety++;
    }

    @Override
    public String toString() {
        return name + "{appetite=" + appetite + ", satiety=" + satiety + "}";
    }
}
