package com.strausMAD105;



import java.text.NumberFormat;

public class Residential extends Customer {
    private double RATE = 6;
    private double invoice;
    private double temp;
    private String subHeading;
    private boolean isMany;

    public Residential()////******************* Default Constructor
    {
        System.out.println("nothing in Commercial");
    }//******************* END Default Constructor

    public Residential (String name, String address, String phone, Boolean multi, Double totalArea, String quote)
    {
        super(name, address, phone, totalArea);// --------- Constructors inherited from Customer
        isMany = multi;
        subHeading = quote;

        double adjustedRate;

        if (isMany)
        {
            temp = (RATE - (RATE * .15));
            System.out.println(temp);
            adjustedRate = (temp/1000);
        }
        else
        {
            adjustedRate = RATE/1000;
        }
        invoice = (adjustedRate * getSquareFootage());
    }// ----------- END method Commercial


    public double getRATE() {
        return RATE;
    }
    public double getInvoice() {
        return invoice;
    }
    public boolean isMany() {
        return isMany;
    }
    public double getTemp() {
        return temp;
    }

    public void calculateWeekly()
    {
        NumberFormat nf = NumberFormat.getNumberInstance();// -------- formatter object for number display with commas
        NumberFormat nfCurrency = NumberFormat.getCurrencyInstance();// -------- formatter for currency display ----
        System.out.println("\n\tRESIDENTIAL CUSTOMER " + subHeading);
        writeCommonCustomer();
        System.out.println("Standard Residential rate: " + nfCurrency.format(getRATE()) + " per 1,000 SqFt");
        System.out.println("Senior Citizen discount = " + isMany());
        if (isMany)
        {
            System.out.println("Adjusted rate for Senior Citizen: " + nfCurrency.format(getTemp()));
        }
        System.out.println("Total Square Footage: " +nf.format(getSquareFootage()));
        System.out.println("Total charges for weekly maintenance: " + nfCurrency.format(getInvoice()));
    }// ------------ END of method calculateWeekly()


}// ---------- END of class Commercial
