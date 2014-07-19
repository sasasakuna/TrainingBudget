package com.thoughtworks.tb.service;

import com.thoughtworks.tb.model.Expense;
import com.thoughtworks.tb.service.DataService;
import org.junit.Test;

import java.util.List;

/**
 * Created by hjli on 7/17/14.
 */
public class DataServiceTest {

    @Test
    public void should_get_queryRecord(){
        DataService dataService = new DataService();
        List<Expense> expenseList = dataService.getExpenseByID("EMP15153");
        for(Expense expense : expenseList){
            System.out.println(expense);
        }
    }

    @Test
    public void should_filter_expense(){
        DataService dataService = new DataService();
        List<Expense> expenseList = dataService.getExpenseByID("EMP14335");
        expenseList = dataService.filterExpenseByCond(new String[]{"Books","Training/Education"}, expenseList);
        for(Expense expense : expenseList){
            System.out.println(expense);
        }
    }

}
