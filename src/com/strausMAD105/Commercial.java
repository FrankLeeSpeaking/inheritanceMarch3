package com.strausMAD105;



import java.text.NumberFormat;

public class Commercial extends Customer {
    private double RATE = 5;
    private double invoice;
    private double temp;
    private String primaryName;
    private boolean isMany;

    public Commercial()////******************* Default Constructor
    {
        System.out.println("nothing in Commercial");
    }//******************* END Default Constructor

    public Commercial (String name, String address, String phone, Boolean multi, String propertyName, Double totalArea)
    {
        super(name, address, phone, totalArea);// --------- Constructors inherited from Customer
        isMany = multi;
        primaryName = propertyName;
        double adjustedRate;

        if (isMany)
        {
            temp = (RATE - (RATE * .1));
            System.out.println(temp);
            adjustedRate = (temp/1000);
        }
        else
        {
            adjustedRate = RATE/1000;
        }
        invoice = (adjustedRate * getSquareFootage());
    }// ----------- END method Commercial


    public String getPropertyName() {
        return primaryName;
    }

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
        System.out.println("\n\tCOMMERCIAL CUSTOMER INVOICE");
        writeCommonCustomer();
        System.out.println("\tPRIMARY PROPERTY NAME: " + getPropertyName());
        System.out.println("Standard Commercial rate: " + nfCurrency.format(getRATE()) + " per 1,000 SqFt");
        System.out.println("Multiple Properties = " + isMany());
         if (isMany)
        {
            System.out.println("Adjusted rate for multiple properties: " + nfCurrency.format(getTemp()));
        }
        System.out.println("Total Square Footage: " +nf.format(getSquareFootage()));
        System.out.println("Total charges for the week: " + nfCurrency.format(getInvoice()));
    }// ------------ END of method calculateWeekly()
}// ---------- END of class Commercial
