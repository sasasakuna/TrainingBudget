package com.thoughtworks.tb.service;

import com.thoughtworks.tb.model.Expense;

import java.util.List;

/**
 * Created by hjli on 7/17/14.
 */
public class DataService {

    public List<Expense> getExpenseByID(String ID) {

        ExpenseService expenseService = new ExpenseService();
        return  expenseService.getExpenseByID(ID);

    }

    public List<Expense> filterExpenseByCond(String[] conds, List<Expense> expenses) {


        ExpenseService expenseService = new ExpenseService();
        return expenseService.filterExpenseByCond(conds, expenses);
    }

    public boolean isEmployeeExist(String cond){
        ConsultantService consultantService = new ConsultantService();
        return  consultantService.isEmployeeExist(cond);
    }


}
