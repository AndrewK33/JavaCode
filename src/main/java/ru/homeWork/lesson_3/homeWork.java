package ru.homeWork.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class homeWork {

    public static void main(String[] args) {
        gameRandom();


        arraygame();
    }

    public static void gameRandom() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int choise;
        do {
            int randomInt = random.nextInt(10);
            System.out.println(randomInt);

            for (int i = 1; i <= 3; i++) {
                System.out.println("Попробуйте угадать число. Загаданное число находится в диапазоне от 0 до 9: ");
                int a = sc.nextInt();
                if (a == randomInt) {
                    System.out.println("Верно, вы угадали!");
                    break;
                } else if ( a > randomInt) {
                    System.out.println("Загаданное число меньше. Количество оставшихся попыток: " + (3 - i));
                } else {
                    System.out.println("Загаданное число больше. Количество оставшихся попыток: " + (3 - i));
                }
            }
            System.out.println("Игра окончена. Хотите сыграть ещё раз? (0.Да 1.Нет): ");
            choise = sc.nextInt();

        } while (choise != 1);

        return;
    }

    public static void arraygame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int randomInt = random.nextInt(words.length);
        String randomWord = words[randomInt];
        System.out.println(randomWord);
        System.out.println("Компьютер загадал слово. Попробуй угадай. Введите слово: ");

        while (true) {
            String getWord = sc.nextLine();
            if (getWord.equals(randomWord)) {
                System.out.println("Отлично, ты угадал!");
                break;
            } else {
                int lengthWord;
                if (getWord.length() > randomWord.length()) {
                    lengthWord = randomWord.length();
                } else {
                    lengthWord = getWord.length();
                } // ветвление для того, чтобы определить минимальную длинну массивов

                System.out.println("Попробуй ещё раз, угаданные буквы: ");
                for (int i = 0; i < lengthWord; i++) {
                    if (randomWord.charAt(i) == getWord.charAt(i)) {
                        System.out.print(randomWord.charAt(i));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }

        return;
    }

}
