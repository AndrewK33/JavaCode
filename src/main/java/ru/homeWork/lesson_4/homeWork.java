package ru.homeWork.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class homeWork {

        public static int SIZE = 3; // объявление и инициация константы размера поля
        public static int DOTS_TO_WIN = 3;  // объявление и инициация константы количества фишек
        public static final char DOT_EMPTY = '•'; // константы для фишек Х, О и пустого поля •
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map; // объявление пустого массива для игрового поля
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {     // создание цикла с предусловием, что пока у нас соблюдаются все условия - игра идет, иначе выводит через sout Игра закончена
                humanTurn();    // последовательный вызов методов, для ходов человека/ ai
                printMap();
                if (checkWin(DOT_X)) {    // проверка на победу после хода, есть ли символ Х в 3х подряд элементах массива
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {        // проверка на победу после хода, если поле заполнено и нет условий выиграша человека/ ai, то выводит Ничью
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();         // последовательный вызов методов, для ходов человека/ ai
                printMap();
                if (checkWin(DOT_O)) {  // проверка на победу после хода, есть ли символ О в 3х подряд элементах массива
                    System.out.println("Победил Компьютер");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");   // при выходе из цикла с предусловием выводит в консоль сообщение Игра закончена
        }


        public static boolean checkWin(char symb) {   // создание метода на проверку условий для выигрыша

            return checkWinnerHorizontal(symb) ||
                    checkWinnerVertical(symb) ||
                    checkWinnerDiagonals(symb);


/*          if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
            if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
            if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
            return false;*/
        }




        private static boolean checkWinnerHorizontal(char symb) {


            for (int i = 0; i < SIZE; i++) {
                boolean result = true;
                for (int j = 1; j < SIZE && result; j++)
                result = map[i][j] == symb;
                if (result) return true;
            }
            return false;

        }


        private static boolean checkWinnerVertical(char symb) {


            for (int i = 0; i < SIZE; i++) {
                boolean result = true;
                for (int j = 0; j < SIZE && result; j++) {
                    result = map[j][i] == symb;
                    if (result) return true;
                }
            }
            return false;
        }

        private static boolean checkWinnerDiagonals(char symb) {

            boolean result = true;

            for (int i = 1; i < SIZE && result; i++) {
                result = map[SIZE - i - 1][i] == map[SIZE - 1][0];
            }

            for (int i = 1; i < SIZE && result; i++) {
                result = map[i][i] == map[0][0];
            }
            if (result) return true;
            return false;
        }


        public static boolean isMapFull() {   // создание метода, который будет проверять заполнено ли поле или нет

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;

        }


        public static void aiTurn() {  // создание аналогичного метода для хода компьютера, только + рандомайзер в которые подаём диапазон от 0 до SIZE
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }


        public static void humanTurn() {    // создание метода, отвечающего за ход человека
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // цикл do, с пост-условием на возможность проставление координат. Т.е. пока можно поставить фишку по указанным координатам, то ход возможен, иначе выходит из цикла
            map[y][x] = DOT_X;
        }


        public static boolean isCellValid(int x, int y) { // метод для проверки значений на валидность, т.е. чтобы вводимые значения входили в диапазон массива и не выходили за outOfBound
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }


        public static void initMap() {       // инициализация поля и заполнение (i + j) значением переменной DOT_EMPTY, с помощью вложенного цикла
            map = new char[SIZE][SIZE];      // в данной строке выделяется память под двухмерный массив в размером, указанный в переменной SIZE
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }


        public static void printMap() {      // заполнение поля (двухмерный массив i + j) пустым символом и вывод в консоль
            for (int i = 0; i <= SIZE; i++) {  // вывод в консоль шапки поля
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}

