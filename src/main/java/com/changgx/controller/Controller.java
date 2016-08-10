package com.changgx.controller;

import com.changgx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/8/10.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    public BookService bookService;


    @RequestMapping("test.do")
    public String index(){
        return "success";
    }
    @RequestMapping("select.do")
    public ModelAndView select(){
        ModelAndView mv=new ModelAndView("success");
        System.out.println(bookService.select());
        mv.addObject("book",bookService.select());
        return mv;
    }
}
