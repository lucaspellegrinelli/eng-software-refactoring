package com.lucaspellegrinelli.engsoftrefactor;

import java.util.Enumeration;
public class HtmlStatement extends Statement{
    public String createHeader(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    public String createItem(Rental aRental){
        return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    public String createFooter(Customer aCustomer){
        String out = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        out += "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return out;
    }
}
