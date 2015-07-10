/**
 * Created by Aman on 10-07-2015.
 */

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the no. of places upto which to print the binary numbers");
        int no;
        no = a.nextInt();
        System.out.println(no);
        double b = Math.pow(2, no);

        System.out.println("therefore loop will run " + b + "  times");



        for (int i = 0; i < b; i++) {
            System.out.println("Binary is " + Integer.toBinaryString(i));

        }
    }}


/* public String binaryString(int number) {

        String result = "";

        while (number > 0)

        {
            result = number % 2 + result;
            number = number / 2;
        }

        return result;*/


