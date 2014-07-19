package com.thoughtworks.tb.service;

import com.thoughtworks.tb.service.ConsultantService;
import org.junit.Test;

/**
 * Created by hjli on 7/18/14.
 */
public class ConsultantServiceTest {
    @Test
    public void should_extra_emplid_from_ID(){

        ConsultantService consultantService = new ConsultantService();
        System.out.println(consultantService.getEmplid_From_ID("EMP15153"));

    }

    @Test
    public void should_get_tw_year_of_exp(){
        ConsultantService consultantService = new ConsultantService();
        System.out.println(consultantService.getTw_years_of_EXP("EMP16128"));
    }
}
