package com.company;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


public class MethodExercises {
    Scanner sc = new Scanner(System.in);

    //------------------------------------------------------
    //Adds 2 numbers
    static int addTwo(int a, int b) {
        int addition = a + b;
        System.out.print(addition);
        return addition;
    }

    //------------------------------------------------------
    //Returns the division of 2 numbers and displays an error when denominator is 0
    static String divTwo(int x, int y) {
        String result;
        if (y != 0) {
            int division = (x / y);
            result = "The result is " + division;
        } else {
            result = "Invalid result";
        }
        System.out.print(result);
        return result;
    }

    //------------------------------------------------------
    //Returns the number of characters in a word
    static int getLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String j = sc.nextLine();
        System.out.print("Your word is " + j.length() + " letters long.");
        return j.length();
    }

    //------------------------------------------------------
    //Returns average of 3 numbers entered by user
    static int getAvg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int e = sc.nextInt();
        System.out.print("Enter second number: ");
        int f = sc.nextInt();
        System.out.print("Enter third number: ");
        int g = sc.nextInt();
        int avg = (e + f + g) / 3;
        System.out.print("Average of your numbers is: " + avg);
        return avg;
    }

    //------------------------------------------------------
    //Determines if a year is leap or not
    static void leapCheck(int year) {

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    //------------------------------------------------------
    //Calculates the area of a rectangle
    static int rectArea(int l, int w) {
        System.out.print(l * w);
        return l * w;
    }

    //------------------------------------------------------
    //Counts the numbers of words in a sentence
    static int wordCount() {
        Scanner sc = new Scanner(System.in);
        String j = sc.nextLine();
        String[] arrOfj = j.split(" ");
        int counted = arrOfj.length;
        System.out.print("There are " + counted + " words in your sentence.");
        return counted;
    }

    //------------------------------------------------------
    //Converts a sentence into an Array
    //Coverts the Array into an ArrayList
    //Selects a random word from the ArrayList and displays a message
    static String randWord() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter a sentence: ");
        String k = sc.nextLine();
        ArrayList<String> listOfk = new ArrayList<String>();
        String[] j = (k.split(" "));
        for (int i = 0; i < j.length - 1; i++) {
            //System.out.println(j[i]);
            listOfk.add(j[i]);
        }
        //String[] arrOfk = k.split(" ");
        //listOfk = Arrays.asList(arrOfk);
        int picknumber = rand.nextInt(listOfk.size());
        //String picked = listOfk.get(picknumber);
        //System.out.println("Random word is \"" + picked +"\"");
        System.out.println("Random word is \"" + listOfk.get(picknumber)+"\"");
        return listOfk.get(picknumber);
    }
//
// ------------------------------------------------------
//    static int rand5 (int m) {
//        for (int i = 0; i < 5; i++) {
//            Random rand = new Random();
//            int generated = rand.nextInt(m);
//        }
//        return generated;
//    }


    public static void main(String[] args) {
        // Methods Exercises
        //addTwo
        //divTwo
        //getAvg();
        //getLength();
        //leapCheck
        //rectArea
        //wordCount();
        randWord();

    }
}