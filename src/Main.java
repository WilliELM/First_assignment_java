import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static <Char> void main(String[] args) {
        assignment1();
        assignment2();
        assignment3();
        assignment4();
        assignment5();
        assignment6();
        assignment7();
    }
        // A person is elligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is elligible to vote.
        // Let the user input their age. Get inspiration in the terminal output below

        public static void assignment1() {
            // Using Scanner for Getting Input from User
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter your age");
            int enterAge = in.nextInt();
            if (enterAge >= 18) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }
        }


        public static void assignment2() {
            //Define two methods to print the maximum and the minimum number respectively among three numbers
            int[] arr = {1, 18, 8};
            int max = arr[0];
            int i;
            for (i = 1; i < arr.length; i++)
                if (arr[i] > max)
                    max = arr[i];
            System.out.println("The highest number is " + max);
        }

        public static void assignment3() {

            //Define a program to find out whether a given number is even or odd
            Scanner oddNumber = new Scanner(System.in);
            System.out.println("Enter a number to check if it is even or odd");
            int enteredNumber = oddNumber.nextInt();
            if (enteredNumber % 2 == 0)
                System.out.println(enteredNumber + " is an even number");
            else
                System.out.println(enteredNumber + " is an odd number");

        }

        //Write a program that takes your full name as input and displays the abbreviations of
        // the first and middle names except the last name which is displayed as it is.
        //For example, if your name is Robert Brett Roser, then the output should be R.B. Roser.
        // Or Benjamin Dalsgaard Hughes will be B.D. Hughes
        public static void assignment4() {
            Scanner fullNameCheck = new Scanner(System.in);
            System.out.println("Please write your full name");
            String providedName = fullNameCheck.nextLine();
            String[] splitName = providedName.split(" ");
            char firstName = splitName[0].charAt(0);
            char middleName = splitName[1].charAt(0);
            String lastName = splitName[2];
            System.out.println("Your abbreviation would be: " + firstName + ". " + middleName + ". " + lastName);
        }

        //There is a car, which has attributes model and price, and the car has functionalities start, stop and move.
        // Also, there is a driver, having attributes name and age, and the behaviour drive.
        //Create the classes Car and Driver. The functionality of the methods does not matter. Just print something to the console
        public static void assignment5() {
            Car peugeot = new Car("Peugeot", 2000.99, true, true, false);
            System.out.println(peugeot);
            Driver Jannik = new Driver("Jannik", 29, "Peugeot", 11);
            System.out.println(Jannik);
        }
        //Create a class called Employee that includes three pieces of information as instance variables
        //A first name
        //A last name
        //A monthly salary
        //Your class should have a constructor that initializes the three instance variables.
        //If the monthly salary is not positive, set it to 0.0.
        //Create two Employee objects and display each object’s yearly salary.
        //Then give each Employee a 10% raise and display each Employee’s yearly salary again.

        public static void assignment6() {
            Employee Poul = new Employee("Poul", "Larsen", 5000.99);
            Employee Erik = new Employee("Erik", "Kjeldsen", 8900.11);
            System.out.println("This is " + Erik.firstName + "'s salary: " + Erik.monthlySalary);
            System.out.println("This is " + Poul.firstName + "'s salary: " + Poul.monthlySalary);
            Poul.monthlySalary = Poul.monthlySalary * 1.1;
            Erik.monthlySalary = Erik.monthlySalary * 1.1;
            System.out.println(Erik.monthlySalary);
            System.out.println(Poul.monthlySalary);
        }
        //Write a program that will return true if a word somewhere has letters that comes after each other in the alphabet.
        //Fx the word Abracadabra should return true because the two characters A and b comes after each other in the alphabet and comes after each other in the word.
        //Hello should return false because there are no characters that comes after each other in the alphabeat
        //Nope should return true because o comes after n in the alphabet
        public static void assignment7() {
            System.out.println(Anagram.Anagram("abe"));
        }


}




