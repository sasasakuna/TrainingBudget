package com.thoughtworks.tb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

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

        ArrayList<Record> allRecords = new ArrayList<Record>();
        allRecords.add(new Record("1","name1","meals","150"));
        allRecords.add(new Record("1","name1","meals","150"));
        allRecords.add(new Record("1","name1","meals","150"));
        allRecords.add(new Record("1","name1","meals","150"));

        model.addAttribute("allRecords", allRecords);

        return "result";

    }
}
