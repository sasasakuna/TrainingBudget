package com.thoughtworks.tb.model;

/**
 * Created by hjli on 7/17/14.
 */
public class Consultant {
    private String employee_ID;
    private String name;
    private String tW_Years_of_EXP;

    public String getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(String employee_ID) {
        employee_ID = employee_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
         name = name;
    }

    public String getTW_Years_of_EXP() {
        return tW_Years_of_EXP;
    }

    public void setTW_Years_of_EXP(String TW_Years_of_EXP) {
        this.tW_Years_of_EXP = TW_Years_of_EXP;
    }
}
