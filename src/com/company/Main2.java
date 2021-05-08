package com.company;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        int age;
        Random rnd = new Random();

        age = rnd.nextInt(200) + 1;
        System.out.println("Age =" + age);

        if (age > 0 && age <= 6) {
            System.out.println("Детсадовец");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Школьник");
        }
        if (age >= 18 && age <= 25) {
            System.out.println("Студент");
        }
        if (age >= 26 && age <= 55) {
            System.out.println("Рабочий");
        }
        if (age >= 56 && age <= 120) {
            System.out.println("Пенсионер");
        }
        if (age > 120) {
            System.out.println("Столько не живут");
        }

    }
}


