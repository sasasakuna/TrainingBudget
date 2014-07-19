package com.thoughtworks.tb.model;

/**
 * Created by hjli on 7/17/14.
 */
public class Expense {

    public String empl_ID;
    public String name;
    public String cost_in_Home_Currency;



    public String getEmpl_ID() {
        return empl_ID;
    }

    public void setEmpl_ID(String empl_ID) {
        this.empl_ID = empl_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expense(String empl_ID, String name, String cost_in_Home_Currency, String expense_Type) {
        this.empl_ID = empl_ID;
        this.name = name;
        this.cost_in_Home_Currency = cost_in_Home_Currency;
        this.expense_Type = expense_Type;
    }

    public String getCost_in_Home_Currency() {
        return cost_in_Home_Currency;
    }

    public void setCost_in_Home_Currency(String cost_in_Home_Currency) {
        this.cost_in_Home_Currency = cost_in_Home_Currency;
    }

    public String getExpense_Type() {
        return expense_Type;
    }

    public void setExpense_Type(String expense_Type) {
        this.expense_Type = expense_Type;
    }

    public String expense_Type;

    @Override
    public String toString() {
        return "Expense{" +
                "Empl_ID='" + empl_ID + '\'' +
                ", Name='" + name + '\'' +
                ", Cost_in_Home_Currency='" + cost_in_Home_Currency + '\'' +
                ", Expense_Type='" + expense_Type + '\'' +
                '}';
    }
}
