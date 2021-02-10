package ru.homeWork.lesson_6;

public class Dog extends Animals {

    private static Animals[] dogsArray = new Animals[3];


    public Dog (String animalType, String nickName, double runningLimitation, double swimmingDistans) {
        super(animalType, nickName, runningLimitation, swimmingDistans);
    }

    public static void main(String[] args) {
        dogsArray[0] = new Animals("Dog","Pechenka", 100, 0);
        dogsArray[1] = new Animals("Dog","Blue", 320, 0);
        dogsArray[2] = new Animals("Dog","Rex", 30, 10);
        System.out.println("Объявляем соревнования по бегу для собак на дистанцию " + getRunDistans());
        System.out.println("_________________________________________________________________");
        dogsRunning();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Объявляем соревнования по плаванью для собак на дистанцию " + getSwimDistans());
        System.out.println("_________________________________________________________________");
        dogsSwimming();
    }

    public static void dogsRunning() {

        dogsArray[0].animalRunning();
        dogsArray[1].animalRunning();
        dogsArray[2].animalRunning();
        System.out.println("Всего участвовало собак: " + getAnimalsCount());
    }

    public static void dogsSwimming() {


        dogsArray[0].animalSwimming();
        dogsArray[1].animalSwimming();
        dogsArray[2].animalSwimming();
        System.out.println("Всего участвовало собак: " + getAnimalsCount());
    }




}
