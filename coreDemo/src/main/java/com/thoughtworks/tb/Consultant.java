package com.thoughtworks.tb;

/**
 * Created by hjli on 7/17/14.
 */
public class Consultant {
    private String Employee_ID;
    private String Name;
    private String TW_Years_of_EXP;

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(String employee_ID) {
        Employee_ID = employee_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTW_Years_of_EXP() {
        return TW_Years_of_EXP;
    }

    public void setTW_Years_of_EXP(String TW_Years_of_EXP) {
        this.TW_Years_of_EXP = TW_Years_of_EXP;
    }
}
