package com.ancentury;

import java.util.Date;

public class Invoice {

    private String name;
    private Date date;
    private Double amount;

    public Invoice(String name, Date date, Double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public Invoice() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
