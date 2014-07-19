package com.thoughtworks.tb.service;

import com.thoughtworks.tb.model.Expense;
import org.junit.Test;

import java.util.List;

/**
 * Created by hjli on 7/17/14.
 */
public class DataServiceTest {



    @Test
    public void should_get_queryRecord(){
        DataService dataService = new DataService();
        List<Expense> expenseList = dataService.getExpenseByID("11111");
        if(expenseList!=null)
            for(Expense expense : expenseList){
                System.out.println(expense);
            }
    }

    @Test
    public void should_filter_expense(){
        DataService dataService = new DataService();
        List<Expense> expenseList = dataService.getExpenseByID("11111");
        expenseList = dataService.filterExpenseByCond(new String[]{"Books","Training/Education"}, expenseList);
        if(expenseList!=null)
            for(Expense expense : expenseList){
                System.out.println(expense);
            }
    }
}
