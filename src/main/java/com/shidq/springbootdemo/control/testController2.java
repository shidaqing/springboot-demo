package com.shidq.springbootdemo.control;

import com.shidq.springxml.model.Hero;
import com.shidq.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController2 {
    @Autowired
    Hero hero ;

    @RequestMapping("/say3")
    public String sayhello3(){
        return "hello2: "+hero.getName() ;
    }

}
