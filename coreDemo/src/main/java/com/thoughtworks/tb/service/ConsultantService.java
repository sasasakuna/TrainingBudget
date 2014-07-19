package com.thoughtworks.tb.service;

import com.thoughtworks.tb.dao.DataDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by hjli on 7/18/14.
 */
public class ConsultantService {

    public float getTw_years_of_EXP(String ID){

        String empl_id = getEmplid_From_ID(ID);
        String result = null;

        Connection con = DataDao.getConnection();
        Statement statement = DataDao.getStatement(con);
        //查询用户信息
        String userSql = "select TW_Years_of_EXP from consultant where Employee_ID = '" + empl_id + "';";
        ResultSet expenseRS = DataDao.getRs(statement, userSql);


        if (expenseRS != null) {
            result = new String();
            try {
                while (expenseRS.next()) {
                    result = expenseRS.getString("TW_Years_of_EXP");
                }

                expenseRS.close();
                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
        if(result!=null&&!result.isEmpty())
            return Float.valueOf(result);
        else
            return 0f;
    }

    public String getEmplid_From_ID(String ID) {
        String temp = new String(ID);
        return temp.replaceAll("\\D+","");
    }
}
