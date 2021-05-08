package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a = 0;

        Scanner input = new Scanner(System.in);

//        try {
//            a = input.nextInt();
//        }
//        catch (Exception e){
//            System.out.println("Ошибка ввода программа закрыта");
//            return;
//        }

        try {
            a = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Ошибка ввода. Будет задано значение по умолчанию");
            a = 15;
        }


        System.out.println(a);
    }
}
