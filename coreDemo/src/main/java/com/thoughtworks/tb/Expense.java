package com.thoughtworks.tb;

/**
 * Created by hjli on 7/17/14.
 */
public class Expense {

    private String Empl_ID;
    private String Name;
    private String Cost_in_Home_Currency;

    public String getExpense_Date() {
        return Expense_Date;
    }

    public void setExpense_Date(String expense_Date) {
        Expense_Date = expense_Date;
    }

    public String getEmpl_ID() {
        return Empl_ID;
    }

    public void setEmpl_ID(String empl_ID) {
        Empl_ID = empl_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCost_in_Home_Currency() {
        return Cost_in_Home_Currency;
    }

    public void setCost_in_Home_Currency(String cost_in_Home_Currency) {
        Cost_in_Home_Currency = cost_in_Home_Currency;
    }

    public String getExpense_Type() {
        return Expense_Type;
    }

    public void setExpense_Type(String expense_Type) {
        Expense_Type = expense_Type;
    }

    private String Expense_Date;
    private String Expense_Type;



}
