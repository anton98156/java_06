// ДЗ:
// Кот (имя, аппетит, сытность)
// Тарелка (содержит какое-то количество еды)
// Кот ест из тарлеки. Если в тарелке недостаточно еды - кот ее не трогает
// while (true) -> while (!plate.isEmpty())
// 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
// В конце каждого цикла мы досыпаем в тарелку еду.
// Для досыпания еды сделать метод increaseFood в классе Plate.
// 2. Поменять поле satiety у кота с boolean на int.
// Допустим у кота аппетит 10, сытность 3. Значит кот захочет поесть 7 единиц.
// 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.

package ru.gb;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Cat murzik = new Cat("Murzik", 15);
        Cat barsik = new Cat("Barsik", 10);
        Cat oliver = new Cat("Oliver", 8);
        Cat garfield = new Cat("Garfield", 22);

        Plate plate = new Plate(300);

        // Добавить условие, что если все подошли, но никто не поел, то тоже надо завершать цикл, 
        // потому что они могут хотеть больше, чем в тарелке

       while (true) {

            murzik.makeHungry();
            barsik.makeHungry();
            oliver.makeHungry();
            garfield.makeHungry();

            murzik.eat(plate);
            barsik.eat(plate);
            oliver.eat(plate);
            garfield.eat(plate);

            System.out.println(plate);
            System.out.println(murzik);
            System.out.println(barsik);
            System.out.println(oliver);
            System.out.println(garfield);

            Thread.sleep(750);
       }
    }
}