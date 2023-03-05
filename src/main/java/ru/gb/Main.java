

// ДЗ:

// while (true) -> while (!plate.isEmpty())
// 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
// В конце каждого цикла мы досыпаем в тарелку еду.
// Для досыпания еды сделать метод increaseFood в классе Plate.
// 2. Поменять поле satiety у кота с boolean на int.
// Допустим у кота аппетит 10, сытность 3. Значит кот захочет поесть 7 единиц.
// 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.

package ru.gb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Cat murzik = new Cat("Murzik", 12);
        Cat barsik = new Cat("Barsik", 10);
        Cat oliver = new Cat("Oliver", 8);
        Cat garfield = new Cat("Garfield", 22);
        
        ArrayList<Cat> cats = new ArrayList<Cat>(3);
        cats.add(murzik);
        cats.add(barsik);
        cats.add(oliver);
        cats.add(garfield);

        Plate plate = new Plate(300);

        while (!plate.isEmpty(plate)) {
    
            cats.get(0).makeHungry();
            cats.get(1).makeHungry();
            cats.get(2).makeHungry();
            cats.get(3).makeHungry();
            
            cats.get(0).eat(plate);
            cats.get(1).eat(plate);
            cats.get(2).eat(plate);
            cats.get(3).eat(plate);

            System.out.println(plate);
            System.out.println(cats.get(0));
            System.out.println(cats.get(1));
            System.out.println(cats.get(2));
            System.out.println(cats.get(3));
            
            Thread.sleep(500);
            
            plate.increaseFood(plate);
        }      
    }
}