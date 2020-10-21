package com.lucaspellegrinelli.engsoftrefactor;

import java.util.Enumeration;
public class TextStatement extends Statement{

    private String createHeader(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String createItem(Rental aRental){
        return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
    }

    private String createFooter(Customer aCustomer){
        String out = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        out += "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return out;
    }

    public String value(Customer aCustomer){
        String finalValue = "";
        Enumeration rentals = aCustomer.getRentals();

        finalValue += createHeader(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            finalValue += createItem(each);
        }

        finalValue += createFooter(aCustomer);
        return finalValue;
    }
}
