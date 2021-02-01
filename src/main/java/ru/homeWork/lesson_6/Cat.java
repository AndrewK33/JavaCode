package ru.homeWork.lesson_6;



public class Cat extends Animals {
    private static Animals[] catsArray = new Animals[4];

    public Cat(String animalType, String nickName, double runningLimitation, double swimmingDistans) {
        super(animalType, nickName, runningLimitation, swimmingDistans);
    }

    public static void main(String[] args) {
        catsArray[0] = new Animals("Cat","Barsic", 100, 0);
        catsArray[1] = new Animals("Cat","Fluffy", 320, 0);
        catsArray[2] = new Animals("Cat","Corsh", 30, 10);
        System.out.println("Объявляем соревнования по бегу для кошек на дистанцию " + getRunDistans());
        System.out.println("_________________________________________________________________");
        catsRunning();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Объявляем соревнования по плаванью для кошек на дистанцию " + getSwimDistans());
        System.out.println("_________________________________________________________________");
        catsSwimming();

    }

    public static void catsRunning() {

        catsArray[0].animalRunning();
        catsArray[1].animalRunning();
        catsArray[2].animalRunning();
        System.out.println("Всего участвовало кошек: " + getAnimalsCount());

    }

    public static void catsSwimming() {

        catsArray[0].animalSwimming();
        catsArray[1].animalSwimming();
        catsArray[2].animalSwimming();
        System.out.println("Всего участвовало кошек: " + getAnimalsCount());

    }

}