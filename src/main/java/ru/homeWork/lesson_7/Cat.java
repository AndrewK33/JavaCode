package ru.homeWork.lesson_7;

public class Cat {
    private String catName;
    private int catAppetite;
    private boolean catSatiety = false;


    public Cat (String catName, int catAppetite) {
        this.catName = catName;
        this.catAppetite = catAppetite;
    }

    public void eat (Plate plate) {
        if(plate.getFood() < catAppetite){
            catSatiety = false;
        } else {
            catSatiety = true;
            plate.decreaseFood(catAppetite);
        }
    }

    public boolean isCatSatiety() {
        return catSatiety;
    }

    public String getCatName() {
        return catName;
    }
}
