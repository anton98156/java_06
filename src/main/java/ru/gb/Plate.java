package ru.gb;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void increaseFood(Plate plate) {
        if (food > 0) {
            food = food + 10;
        }
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

    public boolean isEmpty (Plate plate) {
        if (food > 10) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }

}
