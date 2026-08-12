package org.example;

import java.util.Scanner;
import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

//Question 1)

        System.out.println("Welcome back! Please enter your role: ");
        String role = s.nextLine();
        if (role.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin!");
        }else if (role.equalsIgnoreCase("superuser")){
            System.out.println("Welcome superuser!");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("Welcome user!");
        }


        //Question 2)
        System.out.println("Could you please enter three numbers: ");
        System.out.print("First number: ");
        int num1 = s.nextInt();
        System.out.print("Second number: ");
        int num2 = s.nextInt();
        System.out.print("Third number: ");
        int num3 = s.nextInt();

        if (num1 >= num2 && num1 > num3){
            System.out.println(num1);
        }else if (num1 < num2 && num2 > num3){
            System.out.println(num2);
        }else System.out.println(num3);


        //Question 3)
        Random random = new Random();

        int number = random.nextInt(7) + 1;

switch (number) {
    case 1:
        System.out.println("Sunday");
        break;

    case 2:
        System.out.println("Monday");
        break;

    case 3:
        System.out.println("Tuesday");
        break;

    case 4:
        System.out.println("Wednesday");
        break;

    case 5:
        System.out.println("Thursday");
        break;

    case 6:
        System.out.println("Friday");
        break;

    case 7:
        System.out.println("Saturday");
        break;
}

        
        //Question 4
        System.out.println("Please enter your grade as a number: ");
        int grade = s.nextInt();
        if (grade >= 90 && grade <= 100){
            System.out.println("Numeric Score: " + grade + "\nLetter Grade: A");
        }else if (grade >= 80 && grade <= 89){
            System.out.println("Numeric Score: " + grade + "\nLetter Grade: B");
        }else if (grade >= 70 && grade <= 79){
            System.out.println("Numeric Score: " + grade + "\nLetter Grade: C");
        }else if (grade >= 60 && grade <= 69){
            System.out.println("Numeric Score: " + grade + "\nLetter Grade: D");
        }else if (grade <= 59){
            System.out.println("Numeric Score: " + grade + "\nLetter Grade: F");
        }


        //Question 5
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        if (age < 13){
            System.out.println("You are a Child!");
        }else if (age >= 13 && age <= 19){
            System.out.println("You are a Teenager!");
        }else {
            System.out.println("You are an Adult!");
        }


    }
}
