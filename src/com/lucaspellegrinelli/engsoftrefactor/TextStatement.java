package com.lucaspellegrinelli.engsoftrefactor;

import java.util.Enumeration;
public class TextStatement extends Statement{

    public String createHeader(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String createItem(Rental aRental){
        return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
    }

    public String createFooter(Customer aCustomer){
        String out = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        out += "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return out;
    }
}
