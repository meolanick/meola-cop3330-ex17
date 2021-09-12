/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int gender =0;
        boolean isNumber;

        do {
            System.out.println("Enter a 1 if you are male or a 2 if you are female:");

            if(scan.hasNextInt())
            {
                gender = scan.nextInt();
                isNumber = true;
            }
            else{
                isNumber = false;
                scan.next();
            }
        } while (!(isNumber));

        int A;
        int W;
        int H;
        double BAC;
        double r;

        if( gender == 1 )
        {
            System.out.println("male");
            System.out.println("How many ounces of alcohol did you have?");
            A = scan.nextInt();
            System.out.println("What is your weight, in pounds?");
            W = scan.nextInt();
            System.out.println("How many hours has it been since your last drink?");
            H = scan.nextInt();

            r = 0.73;
            BAC = (A * 5.14 / W * r) - .015 * H;

            System.out.println("Your BAC is "+ BAC );

            if( BAC >= 0.08 )
            {
                System.out.println("It is illegal for you to drive.");
            }
            if( BAC < 0.08 )
            {
                System.out.println("It is legal for you to drive.");
            }
        }
        if( gender == 2 )
        {
            System.out.println("female");
            System.out.println("How many ounces of alcohol did you have?");
            A = scan.nextInt();
            System.out.println("What is your weight, in pounds?");
            W = scan.nextInt();
            System.out.println("How many hours has it been since your last drink?");
            H = scan.nextInt();

            r = 0.66;
            BAC = (A * 5.14 / W * r) - .015 * H;

            System.out.println("Your BAC is "+ BAC );

            if( BAC >= 0.08 )
            {
                System.out.println("It is illegal for you to drive.");
            }
            if( BAC < 0.08 )
            {
                System.out.println("It is legal for you to drive.");
            }

        }

    }
}
