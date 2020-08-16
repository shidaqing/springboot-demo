package com.shidq.springbootdemo.schema;

import com.shidq.springbootdemo.model.Hero;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class HeroNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("elementname", new HeroBeanDefinitionParser(Hero.class));
    }
}
