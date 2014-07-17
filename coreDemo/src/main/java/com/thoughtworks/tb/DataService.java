package com.thoughtworks.tb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjli on 7/17/14.
 */
public class DataService {

    public List<Expense> getExpenseByID(String ID) {

        List<Expense> expensesList = null;
        Expense expense = null;
        Connection con = DataDao.getConnection();
        Statement statement = DataDao.getStatement(con);
        String userSql = "select * from employee where uid = '" + ID + "';"; //查询用户信息
        ResultSet expenseRS = DataDao.getRs(statement, userSql);


        if (expenseRS != null) {
            expensesList = new ArrayList<Expense>();
            expense = new Expense();

            try {
                while (expenseRS.next()) {

                    expense.setEmpl_ID(expenseRS.getString("Empl_ID"));
                    expense.setCost_in_Home_Currency(expenseRS.getString("Cost_in_Home_Currency"));
                    expense.setExpense_Date(expenseRS.getString("Expense_Date"));
                    expense.setExpense_Type(expenseRS.getString("Expense_Type"));
                    expenseRS.close();
                    statement.close();
                    con.close();

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
        return expensesList;
    }

}
