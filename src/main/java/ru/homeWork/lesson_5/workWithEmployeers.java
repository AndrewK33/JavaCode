package ru.homeWork.lesson_5;

public class workWithEmployeers {


    public static void main(String[] args) {
        Employeers[] employersArray = new Employeers[5];
        employersArray[0] = new Employeers("Ivanov Ivan", "FrontendEngineer", "ivivan@mailbox.com", "892312312", 30000, 25);
        employersArray[1] = new Employeers("Panov Pavel", "Designer", "123@mailbox.com", "1100101", 30000, 30);
        employersArray[2] = new Employeers("Petrov Petr", "Manager", "456@mailbox.com", "1101001", 30000, 49);
        employersArray[3] = new Employeers("Grigoriev Grigoriy", "ProductOwner", "789@mailbox.com", "1000101", 30000, 73);
        employersArray[4] = new Employeers("Vasin Vasiliy", "BackendEngineer", "109@mailbox.com", "111001", 30000, 40);

        for (int i = 0; i < employersArray.length; i++) {
            if (employersArray[i].getAge() >= 40) {
                employersArray[i].employeesInfo();
            }
        }

    }


}

