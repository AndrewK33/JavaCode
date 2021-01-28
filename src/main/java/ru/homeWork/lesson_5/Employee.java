package ru.homeWork.lesson_5;

public class Employee {

    private String FIO;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

/*    public static void main(String[] args) {
        printInfo();  // для проверки работы метода

    }*/

    public Employee(String FIO, String position, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
}

    public int getAge() {
        return age;
    }


    public void printEmloyeersInfo() {
        System.out.println("ФИО сотрудника: "+ this.FIO + "; Возраст сотрудника: " + this.age + "; Почта сотрудника: " + this.email + "; Номер телефона сотрудника: " + this.phoneNumber + "; Должность сотрудника: " + this.position + "; Зарплата сотрудника:" + this.salary);
    }

    
}
