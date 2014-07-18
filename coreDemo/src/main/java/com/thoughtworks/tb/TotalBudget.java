package com.thoughtworks.tb;

import java.util.Calendar;

/**
 * Created by hjli on 7/18/14.
 */
public class TotalBudget implements ITotalBalance{
    @Override
    public int getTotalBudget(String ID) {
        int totalBudget = 2000;
        ConsultantService consultantService = new ConsultantService();
        float workedYears = consultantService.getTw_years_of_EXP(ID);

        int workedMonths = (int)Math.ceil(workedYears * 12);

        System.out.println(workedMonths);

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH )+1;

        //System.out.println(year + " 年 " + month + " 月");

        int startedWorkedMonth = month - workedMonths + 1;

        //当年入职
        if(startedWorkedMonth>0){
            int monthToDecember = 12 - startedWorkedMonth + 1;
            totalBudget = (10 * 2000)/12;

        }

        return totalBudget;
    }
}
