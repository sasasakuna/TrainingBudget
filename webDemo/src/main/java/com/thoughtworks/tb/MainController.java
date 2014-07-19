package com.thoughtworks.tb;

import com.thoughtworks.tb.core.TotalBudget;
import com.thoughtworks.tb.core.TrainingBudget;
import com.thoughtworks.tb.model.Expense;
import com.thoughtworks.tb.service.DataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by hjli on 7/16/14.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {

        return "index";
    }


    @RequestMapping(value = "/tbQuery", method = RequestMethod.POST)
    public String add(HttpServletRequest request, HttpServletResponse response, ModelMap model){

        String queryCond = request.getParameter("id");
        TrainingBudget trainingBudget = new TrainingBudget(queryCond);
        if(trainingBudget.getStatus().equals("EXIST")){
            List<Expense> expenseList = trainingBudget.getExpense();
            model.addAttribute("expenseRecords", expenseList);

            model.addAttribute("totalBudget", trainingBudget.getTotalBudget());
            model.addAttribute("balance",trainingBudget.getBalance());
            model.addAttribute("status",null);


            return "result";
        }
        else{
            model.addAttribute("status","用户名不存在");
            return "index";
        }


    }
}
