package com.TTS;
import java.util.HashMap;
import java.util.Scanner;

//file is uppercase
//folder is lowercase

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//NUMBERS ACTIVITY

        int[] number = new int[5];
        int sum = 0;
        int product = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter in 5 numbers, pressing enter after each number:");

        for(int index = 0; index < number.length; index++){
            number[index] = scan.nextInt();
        }

        for(int index = 0; index < number.length; index++) {
            if(number[index] == sum) {
            }
        }

        for (int i : number){
            sum += i;
        }

        System.out.println("The sum of the numbers is: " + sum);

        for (int i : number){
            product *= i;
        }

        System.out.println("The product of the numbers is:" + product );

        for (int i : number) {
            if (largest < i ) {
                largest = i ;
            }
        }

        System.out.println("Largest number: " + largest);

        for (int i : number) {
            if (smallest > i ) {
                smallest = i ;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Thank you for participating!");
    }
}


}
