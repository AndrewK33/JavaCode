package ru.homeWork.lesson_1;

public class homeWork {
    public static void main(String[] args) {
        byte Byte = 1;
        short Short = 5, ShortA = 4;
        int Int = 15, IntA = 25;
        long Long = 100l;
        float Float = 15.05F;
        double Double = 125.125;
        char Char = '*';
        boolean Boolean = true, k = false;
        someResult();
        print2SomeInt(10, 15);
        compareNull(-15);
        System.out.println(compareBool(30));
        printSomeTxt("Давид");

    }
    public static float someResult () {
        float a = 10.5F;
        float b = 15.5F;
        float c = 25.5F;
        float d = 35.5F;
        float summResult;
        summResult = (float) a * ((float) b + ((float) c / (float) d));
        System.out.println(summResult);
        return summResult;
    }
    public static void print2SomeInt (int someIntA, int someIntB) {
        if ((someIntA+someIntB)>10&&(someIntA+someIntB)<20){
            System.out.println(true);
        } else System.out.println(false);
    }
    public static void compareNull (int someIntC) {
        if (someIntC>=0) {
            System.out.println("Ваше число положительное");
        } else if (someIntC<0) {
            System.out.println("Ваше число отрицательное");
        }
    }
    public static boolean compareBool (int someIntD) {
        if (someIntD>=0) {
            return false;
        } else {
            return true;
        }
    }
    public static void printSomeTxt (String someString) {
        System.out.println("Привет, "+someString);
    }
}
