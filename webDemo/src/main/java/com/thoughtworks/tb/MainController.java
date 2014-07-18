package com.thoughtworks.tb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjli on 7/16/14.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("logo","images/logo.png");

        return "index";
    }


    @RequestMapping(value = "/tbQuery", method = RequestMethod.POST)
    public String add(HttpServletRequest request, HttpServletResponse response, ModelMap model){

        String empl_id = request.getParameter("id");
        DataService dataService = new DataService();
        List<Expense> expenseList = dataService.getExpenseByID(empl_id);
        expenseList = dataService.filterExpenseByCond(new String[]{"Books","Training/Education"}, expenseList);


        model.addAttribute("expenseRecords", expenseList);

        return "result";

    }
}
