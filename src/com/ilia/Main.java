//Ilia Safarian - 40012341054047
package com.ilia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Ilia";
        String username = "iliasa82";
        String password = "123456";

        System.out.print("Please enter your Name: ");
        String Name = input.nextLine();

        System.out.print("Please enter your Username: ");
        String Username = input.nextLine();

        System.out.print("Please enter your Password: ");
        String Password = input.nextLine();
        if (!Username.equals(username) || !Password.equals(password)){
            throw new ArithmeticException("either the entered Password or Username is invalid.");
        }
        else if (!Name.equals(name))
            throw new ArithmeticException("The name you have entered is invalid.");
        else
            System.out.println("Access granted! -welcome.");
    }
}