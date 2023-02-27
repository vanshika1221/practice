package com.knoldus;
import java.util.Scanner;
import java.lang.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String userInput=sc.nextLine();
        while(true) {
            //Menu for accessing both functions
            System.out.println();
            System.out.println("Enter 1. for Reverse String");
            System.out.println("Enter 2. for Finding the Length of String");
            System.out.println("Enter 3. for exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            //Creating Object of StringFunctions class in string-api module
            StringFunctions object = new StringFunctions();
            switch (choice) {
                case 1:
                    object.reverseString(userInput);
                    break;
                case 2:
                    int count = object.getStringLength(userInput);
                    System.out.println("Length is: " + count);
                    break;
                case 3:
                    System.exit(1);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

