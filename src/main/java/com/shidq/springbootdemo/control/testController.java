package com.shidq.springbootdemo.control;

import com.shidq.springxml.model.Hero;
import com.shidq.util.SpringUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    Hero hero ;
    @RequestMapping("/say")
    public String sayhello(){
        hero = (Hero) SpringUtil.getBean(Hero.class.getName()) ;
        return "hello: "+hero.getName();
    }

    @RequestMapping("/say2")
    public String sayhello2(){
        return "hello2: " ;
    }

}
