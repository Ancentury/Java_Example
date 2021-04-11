package com.ancentury;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("Furniture", new Date(), 13.22);

        System.out.println(invoice);
        ArrayList<Invoice> xxx = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            xxx.add(new Invoice("First " + i, new Date(), 10.00 + i));
        }
    }
}
