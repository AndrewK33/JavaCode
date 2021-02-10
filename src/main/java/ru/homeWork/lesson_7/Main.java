package ru.homeWork.lesson_7;

public class Main {
    public static void main(String[] args) {
        firstEat();
        secondEat();

    }


    public static void firstEat() {
        Cat cat = new Cat("Barsik", 100);
        Plate plate = new Plate(100);
        plate.plateInfo();
        cat.eat(plate);
        plate.plateInfo();

    }

    public static void secondEat() {
        Cat [] cats = new Cat[3];
        cats [0] = new Cat ( "Vasia", 20 );
        cats [1] = new Cat ("Myrzic", 35);
        cats [2] = new Cat ("Bobik", 75);
        Plate plate1 = new Plate(75);
        plate1.plateInfo();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);

        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + cats[i].getCatName() + " сыт: " + cats[i].isCatSatiety());
        }
        plate1.plateInfo();

    }

}
