/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people? ");
        String people = scan.nextLine();
        System.out.print("How many pizzas do you have? ");
        String pizza = scan.nextLine();
        System.out.print("How many slices per pizza? ");
        String slices = scan.nextLine();

        int peo = Integer.parseInt(people);
        int piz = Integer.parseInt(pizza);
        int slice = Integer.parseInt(slices);
        int totalSlices = piz*slice;
        //pizza per person
        int ppp = totalSlices/peo;
        int leftover = totalSlices%peo;

        System.out.println(String.format("%d people with %d pizzas (%d slices)\nEach person gets %d pieces of pizza.\nThere are %d leftover pieces.",peo,piz,totalSlices,ppp,leftover));
    }
}