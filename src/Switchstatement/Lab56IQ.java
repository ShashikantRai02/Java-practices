package Switchstatement;

import java.util.Scanner;

public class Lab56IQ {
    public static void main(String[] args) {
        //web automation testing
        // i will ask to user give me the input from the browser which he wants to automate and then i will write the switch statement for that
        //use to i will start the automation in that browser
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name you want to automate: ");
        String browser=sc.nextLine();
        switch(browser.toLowerCase())
        {
            case "chrome":
                System.out.println("Starting automation in Chrome browser...");
                break;
            case "firefox":
                System.out.println("Starting automation in Firefox browser...");
                break;
            case "edge":
                System.out.println("Starting automation in Edge browser...");
                break;
            case "safari":
                System.out.println("Starting automation in Safari browser...");
                break;
            default:
                System.out.println("Invalid browser name. Please enter a valid browser name.");
        }
    }
}
