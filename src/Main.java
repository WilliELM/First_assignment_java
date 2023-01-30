import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static <Char> void main(String[] args) {

        // A person is elligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is elligible to vote.
        // Let the user input their age. Get inspiration in the terminal output below

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age");
        int enterAge = in.nextInt();
        if (enterAge >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }


        //Define two methods to print the maximum and the minimum number respectively among three numbers
        int[] arr = {1,18,8};
        int max = arr[0];
        int i;
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println("The highest number is " + max);


        //Define a program to find out whether a given number is even or odd
        Scanner oddNumber = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd");
        int enteredNumber = oddNumber.nextInt();
        if (enteredNumber % 2 == 0)
            System.out.println(enteredNumber + " is an even number");
        else
            System.out.println(enteredNumber + " is an odd number");



        //Write a program that takes your full name as input and displays the abbreviations of
        // the first and middle names except the last name which is displayed as it is.
        //For example, if your name is Robert Brett Roser, then the output should be R.B. Roser.
        // Or Benjamin Dalsgaard Hughes will be B.D. Hughes

        Scanner fullNameCheck = new Scanner(System.in);
        System.out.println("Please write your full name");
        String providedName = fullNameCheck.nextLine();
        String[] splitName = providedName.split(" ");
        char firstName = splitName[0].charAt(0);
        char middleName = splitName[1].charAt(0);
        String lastName = splitName[2];
        System.out.println("Your abbreviation would be: " + firstName+ ". " + middleName +". " + lastName);






    }







}




