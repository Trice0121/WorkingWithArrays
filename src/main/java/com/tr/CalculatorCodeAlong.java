package com.tr;

import java.util.Scanner;

public class CalculatorCodeAlong {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Gice me a command:");
        System.out.println("(a)dd");
        System.out.println("(s)ubstract");
        System.out.println("(d)ivide");
        System.out.println("(m)ultiply");
        System.out.println("(q)quit");

        String command = userInput.next();
        switch(command){
            case "a":
                System.out.println("Add");
                break;
            case "s":
                System.out.println("Subtract");
                break;
            case "d":
                System.out.println("Divide");
                        break;
            case "m":
                System.out.println("Multiply");
                break;
            default:


        } while(!command.equals("q"));


        System.out.println("Your first number is: " + num1);

    }
}
