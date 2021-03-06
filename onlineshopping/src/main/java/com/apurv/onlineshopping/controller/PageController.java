package com.apurv.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.apurv.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {

    @Autowired
    private CategoryDAO categoryDao;

    @RequestMapping(value= {"/","/home","/index"})
    public ModelAndView index() {
        ModelAndView mv= new ModelAndView("page");
        mv.addObject("title","Home");

        //passing category list from back end
        mv.addObject("categories", categoryDao.list());

        mv.addObject("userClickHome",true);
        return mv;
    }

    @RequestMapping(value="/about")
    public ModelAndView about() {
        ModelAndView mv= new ModelAndView("page");
        mv.addObject("title","About Us");
        mv.addObject("userClickAbout",true);
        return mv;
    }

    @RequestMapping(value="/contact")
    public ModelAndView contact() {
        ModelAndView mv= new ModelAndView("page");
        mv.addObject("title","Contact Us");
        mv.addObject("userClickContact",true);
        return mv;
    }
}