package com.thoughtworks.tb.core;

import com.thoughtworks.tb.core.ITotalBudget;
import com.thoughtworks.tb.service.ConsultantService;

import java.util.Calendar;

/**
 * Created by hjli on 7/18/14.
 */
public class TotalBudget implements ITotalBudget {
    @Override
    public int getTotalBudget(String ID) {
        int totalBudget = 2000;
        ConsultantService consultantService = new ConsultantService();
        float workedYears = consultantService.getTw_years_of_EXP(ID);

        int workedMonths = (int)Math.ceil(workedYears * 12);

        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH )+1;


        int startedWorkedMonth = month - workedMonths + 1;

        //当年入职
        if(startedWorkedMonth>0){
            int monthToDecember = 12 - startedWorkedMonth + 1;
            totalBudget = (monthToDecember * 2000)/12;

        }

        return totalBudget;
    }
}
