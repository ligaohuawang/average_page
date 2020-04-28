package com.lgh.controller;

import com.lgh.entity.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StudentController")
public class StudentController {

    @RequestMapping("/studentPage")
    public String studentPage(Page page, ModelMap map){

        return "";
    }
}
