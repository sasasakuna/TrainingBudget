package com.thoughtworks.tb.service;

import org.junit.Test;

/**
 * Created by hjli on 7/18/14.
 */
public class ConsultantServiceTest
{

    @Test
    public void should_extra_emplid_from_ID(){

        String temp = new String("EMP15153");
        System.out.println(temp.replaceAll("\\D+", ""));

    }

    @Test
    public void should_get_tw_year_of_exp(){

        ConsultantService consultantService = new ConsultantService();
        System.out.println(consultantService.getTw_years_of_EXP("EMP16128"));
    }

    @Test
    public void is_employee_exist(){
        ConsultantService consultantService = new ConsultantService();
        System.out.println(consultantService.isEmployeeExist("EMP16128"));
    }




}
