package Switchstatement;

import java.util.Scanner;

public class Lab54Switch {
    //write a program to find the day of the week using switch statement and using scanner class
    public static void main(String[] args) {
        //int day=Integer.parseInt(args[0]);// taking day as input from command line
        Scanner sc=new Scanner(System.in);// create scanner object
        System.out.println("Enter a day number (1-7):");// prompt user to enter a day number
        int day=sc.nextInt();// take input from user
        switch(day)// switch statement to find the day of the week
        {
            case 1:// if the day number is 1, then it is Monday
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid day");
        }
    }
}
