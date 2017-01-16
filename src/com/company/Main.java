package com.company;

import com.company.models.Shop;
import com.company.models.people.Customer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 */
public class Main {

    /**
     *
     */
    private DateFormat format;

    /**
     *
     */
    private Customer customer;

    /**
     *
     */
    private Shop shop;

    /**
     *
     */
    private Exchange exch;

    /**
     *
     */
    public Main() {

        try {

            this.format = new SimpleDateFormat("dd.MM.yyyy");
            this.shop = new Shop();
            this.customer = new Customer("Randy", this.format.parse("09.12.2016"), 200);
            this.exch = new Exchange(this.shop,this.customer);

        } catch (ParseException e){

            System.out.println("Failed to parse date string");

        }


    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Main program = new Main();
    }
}
