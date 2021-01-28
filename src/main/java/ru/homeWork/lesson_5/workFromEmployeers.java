package ru.homeWork.lesson_5;

public class workFromEmployeers {


    public static void main(String[] args) {

        Employee[] employersArray = new Employee[5];
        employersArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employersArray[1] = new Employee("Vasin Vasiliy", "Office Manager", "123@mailbox.com", "+74992627172", 10000, 40);
        employersArray[2] = new Employee("Anderson Peter", "Manager", "bfg@mailbox.com", "+120331", 70000, 43);
        employersArray[3] = new Employee("Zomosky Gete", "Designer", "artwork@mailbox.com", "NULL", 33000, 67);
        employersArray[4] = new Employee("Neironov Dmitriy", "Test Manager", "test@mailbox.com", "+10101110111", 50000, 29);


        for (int i = 0; i < employersArray.length; i++) {
            if (employersArray[i].getAge() >= 40) {
                employersArray[i].printEmloyeersInfo();
            }
        }

    }

}