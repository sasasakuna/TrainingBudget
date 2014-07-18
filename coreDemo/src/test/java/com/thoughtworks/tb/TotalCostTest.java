package com.thoughtworks.tb;

import org.junit.Test;

/**
 * Created by hjli on 7/18/14.
 */
public class TotalCostTest {
    @Test
    public void should_get_cost(){
        TotalCost cost = new TotalCost();
        double result = cost.getCost("EMP14544");
        System.out.println(result);
    }
}
