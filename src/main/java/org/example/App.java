package org.example;

import java.util.Scanner;

/**
 /*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ivan Pavlov
 */

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n what is your name? ");
        String name = scanner.next();

        //      System.out.println(name);
        System.out.print("\n Hello, ");
        System.out.print(name);
        System.out.print(", " + "nice to meet you!");
    }
}
