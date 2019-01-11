package com.company;
/*use of overloading. it calls the relevant method to print out
where  method names are same but arguments in parameter are different numbers.*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String s1 = getValue("Enter value 1: ");
        String s2 = getValue("Enter value 2: ");
        String s3 = getValue("Enter value 3: ");
        String s4 = getValue("Enter value 4: ");
        String s5 = getValue("Enter value 5: ");
        String s6 = getValue("Enter value 6: ");
        System.out.println("sum of two value is: " + add(s1, s2));
        System.out.println("sum of three value is: " + add(s1, s2, s3));
        System.out.println("sum of six value is: " + add(s1, s2, s3,s4,s5,s6));
    }

    public static String getValue( String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static double add(String st1, String st2) {
        double sum = 0;
        double d1 = Double.parseDouble(st1);
        double d2 = Double.parseDouble(st2);
        sum = d1 + d2;
        return sum;

    }

    public static double add(String st1, String st2, String st3) {
        double sum = 0;
        double d1 = Double.parseDouble(st1);
        double d2 = Double.parseDouble(st2);
        double d3 = Double.parseDouble(st3);
        sum = d1 + d2 + d3;
        return sum;

    }

    public static Double add(String... values) {
        double sum = 0;
        for (String value : values) {
            double d = Double.parseDouble(value);
            sum = sum + d;
        }
        return sum;

    }
}






