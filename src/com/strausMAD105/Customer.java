package com.strausMAD105;

import java.text.NumberFormat;

public class Customer {
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private double squareFootage;

    public Customer()//******************* Default Constructor
    {
        //customerName = "Name in default constructor";
        //customerAddress = "Address in default constructor";
        // customerPhone = "Phone in default constructor";
        // squareFootage = 0;

    }// ******************* END of default constructor

    public Customer (String name, String address, String phone, double totalArea)
    {
        customerName = name;
        customerAddress = address;
        customerPhone = phone;
        squareFootage = totalArea;

    }// ----- END method Customer ------------------

    public String getCustomerName()
    {
        return customerName;
    }//---- END GET name -----------------------

    public final String getCustomerAddress()
    {
        return customerAddress;
    }//---- END GET address -----------------------

    public final String getCustomerPhone()
    {
        return customerPhone;
    }//---- END GET phone -----------------------

    public final double getSquareFootage()
    {
        return squareFootage;
    }//---- END GET squareFootage -----------------------


    public void writeCommonCustomer()
    {
        System.out.println("Name: " + getCustomerName());
        System.out.println("Address: " + getCustomerAddress());
        System.out.println("Phone: " + getCustomerPhone());
    }


}//  ------------ END class Customer
