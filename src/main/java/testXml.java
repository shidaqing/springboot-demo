import com.shidq.springxml.model.Hero;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testXml {

 public static class Main {
     public static void main(String[] args) {
                   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hero.xml");
                  Hero hero = (Hero) applicationContext.getBean(Hero.class.getName());
                  System.out.println("name: " + hero.getName() + " age: " + hero.getAge());
                }
}

}
