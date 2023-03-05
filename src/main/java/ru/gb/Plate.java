package ru.gb;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food = food - foodToDecrease;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty (int food) {
        if (food > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }

}
