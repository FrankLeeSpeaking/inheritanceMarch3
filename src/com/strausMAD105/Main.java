package com.strausMAD105;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = 0;
        //NumberFormat nf = NumberFormat.getNumberInstance();// -------- formatter object for number display with commas

        while (input == 0) {
            System.out.println("1.) For Commercial property: ");
            System.out.println("2.) For Residential property: ");
            System.out.println("3.) Done");
            System.out.println("\nPlease enter a number between 1 and 3:");
            int pick = keyboard.nextInt();
            switch (pick) {
                case 1:
                    commercialClient();
                    input = 1;
                    break;
                case 2:
                    residentialClient();
                    input = 1;
                    break;
                case 3:
                    System.out.println("Thank you for your business!");
                    input = 1;
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 3:");
            }//---End switch pick
        }//-----End while
    } //---END method main

    public static void commercialClient(){
        Boolean multi;
        String discount;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("COMMERCIAL CUSTOMER");
        System.out.print("Enter customer name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter billing address: ");
        String address = keyboard.nextLine();
        System.out.println("Enter phone number");
        String phone = keyboard.next();
        do {
            System.out.print("Does this account have more than one property under contract? (y or n)");
            discount  = keyboard.next();
        }while (!discount.equalsIgnoreCase("y") && !discount.equalsIgnoreCase("n"));
        if (discount.equalsIgnoreCase("y")){
            multi = true;
        }
        else {
            multi = false;
        }
        System.out.println("Enter the full name of the primary property on the contract: ");
        String propertyName = keyboard.next();
        System.out.print("Enter the total area under contract in sq.ft.: ");
        double totalArea = keyboard.nextDouble();
        Commercial client = new Commercial(name, address, phone, multi, propertyName, totalArea);
        client.calculateWeekly();



    }// --------- END public method commercialClient()

    public static void residentialClient(){
        Boolean multi;
        String quote;
        String discount;
        int whichType;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("RESIDENTIAL CUSTOMER");
        System.out.println("Enter customer name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter customer address: ");
        String address = keyboard.nextLine();
        System.out.println("Enter phone number");
        String phone = keyboard.next();
        do {
            System.out.println("1.) Prepare a quote");
            System.out.println("2.) Prepare an invoice");
            whichType = keyboard.nextInt();
        } while (whichType != 1 && whichType != 2);
        if(whichType == 1){
            quote = "QUOTE";
        }
        else {
            quote = "INVOICE";
        }
        do {
            System.out.print("Does the customer qualify for a Senior Citizen Discount? (y or n)");
            discount = keyboard.next();
        }while (!discount.equalsIgnoreCase("y") && !discount.equalsIgnoreCase("n"));
        if (discount.equalsIgnoreCase("y")){
            multi = true;
        }
        else {
            multi = false;
        }
        System.out.print("Enter the total area under contract in sq.ft.: ");
        double totalArea = keyboard.nextDouble();
        Residential client = new Residential(name, address, phone, multi, totalArea, quote);
        client.calculateWeekly();

    }// --------- END public method residentialClient()


}//-----END CLASS MAIN
