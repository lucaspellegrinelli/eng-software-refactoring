package com.lucaspellegrinelli.engsoftrefactor;

import java.util.Enumeration;
public class HtmlStatement extends Statement{
    private String createHeader(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    private String createItem(Rental aRental){
        return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    private String createFooter(Customer aCustomer){
        String out = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        out += "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
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
