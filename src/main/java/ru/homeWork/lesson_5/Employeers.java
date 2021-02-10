package ru.homeWork.lesson_5;

public class Employeers {

    private String FIO;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
    }


    public Employeers(String FIO, String position, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void employeesInfo() {
        System.out.println("Имя сотрудника: " + FIO);
        System.out.println("Возраст сотрудника: " + age);
        System.out.println("Почта сотрудника: " + email);
        System.out.println("Телефонный номер сотрудника: " + phoneNumber);
        System.out.println("Должность сотрудника: " + position);
        System.out.println("Заработная плата сотрудника: " + salary);
        System.out.println("_________________________________________");


    }

}
