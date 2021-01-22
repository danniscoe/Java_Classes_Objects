package com.TTS;
import java.util.HashMap;
import java.util.Scanner;

//file is uppercase
//folder is lowercase

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //CAR DEALERSHIP ACTIVITY

        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Let's check out our inventory.");
            String carModel = scan.nextLine();

            HashMap<String, String> carInventory = new HashMap<>();

            //carInventory.put("key", "value");
            carInventory.put("Chevrolet", "Suburban");
            carInventory.put("Tesla", "Model Y");
            carInventory.put("Corvette", "Stingray");
            carInventory.put("Honda", "Civic");
            carInventory.put("Volkswagon", "Jetta");

            String output = carInventory.get(carModel);

//            I am going to work on being able to pull in the model of the car whenever a customer wants something more specific.

            if (carInventory.containsKey(carModel)) {
                System.out.println("Oh, you're looking for a " + carModel + "?" + " Our "+ carModel + " collection is right over here!");
            }
            else {
                System.out.println("Oh no! That model is on backorder.");

        }
    }
