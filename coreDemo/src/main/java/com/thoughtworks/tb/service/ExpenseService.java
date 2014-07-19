package com.thoughtworks.tb.service;

import com.thoughtworks.tb.dao.DataDao;
import com.thoughtworks.tb.model.Expense;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjli on 7/18/14.
 */
public class ExpenseService {

    public List<Expense> getExpenseByID(String ID) {

        List<Expense> expensesList = null;
        Expense expense = null;
        Connection con = DataDao.getConnection();
        Statement statement = DataDao.getStatement(con);
        String userSql = "select Empl_ID, Name, Cost_in_Home_Currency, Expense_Type from expense where Empl_ID = '" + ID + "';"; //查询用户信息
        ResultSet expenseRS = DataDao.getRs(statement, userSql);


        if (expenseRS != null) {
            expensesList = new ArrayList<Expense>();

            try {
                while (expenseRS.next()) {

                    expense = new Expense(expenseRS.getString("Empl_ID"),
                            expenseRS.getString("Name"),
                            expenseRS.getString("Cost_in_Home_Currency"),
                            expenseRS.getString("Expense_Type"));
                    expensesList.add(expense);



                }


            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
        try {
            expenseRS.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return expensesList;
    }

    public List<Expense> filterExpenseByCond(String[] conds, List<Expense> expenses){


        List<Expense> filteredExpenses = new ArrayList<Expense>();

        for(Expense expense : expenses){
            for(String cond : conds){
                if(expense.getExpense_Type().equals(cond))
                    filteredExpenses.add(expense);
            }
        }

        if (filteredExpenses.size()!=0)
            return filteredExpenses;
        else
            return null;
    }
}
