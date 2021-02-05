package ru.homeWork.lesson_7;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public void decreaseFood (int n) {
        if (n < food) {
            food -= n;
        } else {
            System.out.println("В миске не достаточно еды :(");  // таким образом в тарелке не может быть отрицательного значения и если коту мало еды в тарелке, то он её просто не трогает
        }
    }

    public void plateInfo () {
        System.out.println("В миске " + food + " единиц еды");
    }

    public int getFood() {
        return food;
    }
}
