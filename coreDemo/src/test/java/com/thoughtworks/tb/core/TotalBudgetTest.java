package com.thoughtworks.tb.core;

import com.thoughtworks.tb.core.TotalBudget;
import org.junit.Test;

/**
 * Created by hjli on 7/18/14.
 */
public class TotalBudgetTest {
    @Test
    public void should_get_totalBudget(){
        TotalBudget totalBudget = new TotalBudget();
        System.out.println(totalBudget.getTotalBudget("16128"));
    }
}
