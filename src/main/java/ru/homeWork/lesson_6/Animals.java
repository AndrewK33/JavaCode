package ru.homeWork.lesson_6;


public class  Animals {

    private static double runDistans = 300.01;
    private static double swimDistans = 80.01;

    private static int animalCount;

    private static String animalType;
    private String nickName;
    private double runningLimitation;
    private double swimmingLimitation;





    public Animals (String animalType, String nickName, double runningLimitation, double swimmingLimitation) {
        this.animalType = animalType;
        this.nickName = nickName;
        this.runningLimitation = runningLimitation;
        this.swimmingLimitation = swimmingLimitation;
        animalCount++;

    }



    public static double getRunDistans() {
        return runDistans;
    }

    public static double getSwimDistans() {
        return  swimDistans;
    }


    public static int getAnimalsCount () {
        return animalCount;
    }




    public void animalRunning () {
        if (runningLimitation >= runDistans) {
            System.out.println("Животное " + nickName + " успешно пробежало дистанцию в " + runDistans + " метров");
        } else {
            System.out.println("К сожалению, животное " + nickName + " смогло пробежать только " + runningLimitation + " метров");
        }
    }

    public void animalSwimming () {
        if (animalType.equals("Cat")) {
            System.out.println("Кошки не умеют плавать. Кошки дисквалифицированны.");
        } else {
            if (swimmingLimitation >= swimDistans) {
                System.out.println("Животное " + nickName + " успешно проплыло дистанцию в " + swimDistans + " метров");
            } else {
                System.out.println("К сожалению, животное " + nickName + " смогло проплыть только " + swimmingLimitation + " метров");
            }
        }
    }

}
