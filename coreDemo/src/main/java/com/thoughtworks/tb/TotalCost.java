package com.thoughtworks.tb;

import java.util.List;

/**
 * Created by hjli on 7/18/14.
 */
public class TotalCost implements ITotalCost {
    @Override
    public double getCost(String ID) {
        double totalCost = 0;
        DataService dataService = new DataService();
        List<Expense> expenseList = dataService.getExpenseByID(ID);
        expenseList = dataService.filterExpenseByCond(new String[]{"Books","Training/Education"},expenseList);
        if(expenseList!=null&&expenseList.size()!=0){

            for(Expense expense : expenseList){
                System.out.println(expense);
                totalCost += Double.valueOf(expense.getCost_in_Home_Currency());

            }
        }

        return totalCost;
    }
}
