package com.shidq.springbootdemo.control;

import com.shidq.springbootdemo.model.Hero;
import com.shidq.springbootdemo.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
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
