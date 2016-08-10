package com.changgx;

import com.changgx.service.BookService;
import com.changgx.service.StudenService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2016/7/22.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext act=new ClassPathXmlApplicationContext("classpath:/context/application-context.xml");

        BookService bookService= (BookService) act.getBean("bookService");

        System.out.println(bookService.selectBookSum());
        List books=bookService.select();
        System.out.println(books);

//        StudenService studenService= (StudenService) act.getBean("studenService");
//
//        try{
//            studenService.buyBook("Tom","Java基础");
//        }catch (Exception e){
//            System.out.println("数据不合理");
//        }


    }
}
