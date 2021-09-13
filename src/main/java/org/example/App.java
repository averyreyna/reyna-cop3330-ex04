/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1-4 contains the inputted strings for the mad lib
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String inputNoun = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String inputVerb = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String inputAdj = input3.nextLine();

        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter an adverb: ");
        String inputAdverb = input4.nextLine();

        // used a formatting method for string substitution to avoid tons concatenation
        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", inputVerb, inputAdj, inputNoun, inputAdverb));
    }
}
