package com.thoughtworks.tb.core;

import com.thoughtworks.tb.model.Expense;
import com.thoughtworks.tb.service.DataService;

import java.util.List;

/**
 * Created by hjli on 7/18/14.
 */
public class TrainingBudget {
    public String status;

    public String queryCond;
    public TrainingBudget(String queryCond) {



        this.queryCond = queryCond.replaceAll("\\D+", "");

        status = getStatus();
        expenseList = getDataSet();

    }

    public String getStatus() {
        String employeeStatus = "EXIST";
        DataService dataService = new DataService();

        if(!dataService.isEmployeeExist(queryCond)){
            employeeStatus = "NOT EXIST";

        }
        return employeeStatus;
    }

    public List<Expense> expenseList;

    public List<Expense> getExpense(){

        return  expenseList;
    }

    private List<Expense> getDataSet() {
        String ID = queryCond;
        List<Expense> expenseList = null;
        DataService dataService = new DataService();
        if(status.equals("EXIST")){

            expenseList = dataService.getExpenseByID(ID);

            expenseList = dataService.filterExpenseByCond(new String[]{"Books","Training/Education"}, expenseList);
        }

        return expenseList;
    }

    public double getTotalCost(){
        double totalCost = 0;
        if(expenseList!=null&&!expenseList.isEmpty())
        {
            for(Expense expense : expenseList){
                totalCost += Double.valueOf(expense.getCost_in_Home_Currency());

            }
        }
        return totalCost;
    }

    public double getTotalBudget(){

        return new TotalBudget(queryCond).getTotalBudget();

    }

    public double getBalance(){

        double totalBudget = getTotalBudget();
        double totalCost  = getTotalCost();
        if(totalCost < totalBudget)
            return totalBudget - totalCost;
        else
            return 0;
    }
}
