package com.thoughtworks.tb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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



/*
        model.addAttribute("message", "hello world!");
*/

        return "result";

    }
}
