package com.lucaspellegrinelli.engsoftrefactor;

import java.util.Enumeration;

public abstract class Statement {
    public abstract String createHeader(Customer aCustomer);
    public abstract String createItem(Rental aRental);
    public abstract String createFooter(Customer aCustomer);

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
