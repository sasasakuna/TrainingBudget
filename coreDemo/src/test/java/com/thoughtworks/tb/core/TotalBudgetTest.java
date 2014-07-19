package com.thoughtworks.tb.core;

import org.junit.Test;

/**
 * Created by hjli on 7/18/14.
 */
public class TotalBudgetTest {
    @Test
    public void should_get_totalBudget(){
        TotalBudget totalBudget = new TotalBudget("11111");
        System.out.println(totalBudget.getTotalBudget());
    }

    @Test
    public void is_employee_exist(){
        TrainingBudget trainingBudget = new TrainingBudget("16128");
        System.out.println(trainingBudget.getStatus());

    }
    @Test
    public void should_not_get_expense(){
        TrainingBudget trainingBudget = new TrainingBudget("16128");
        System.out.println(trainingBudget.getExpense());

    }

}
