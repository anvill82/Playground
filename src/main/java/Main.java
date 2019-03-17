//import com.ivo.config.AppConfig;

import com.springinaction.springidol.Performer;
import com.springinaction.springidol.impl.Instrumentalist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Performer performer = context.getBean("Carl", Instrumentalist.class);
        performer.perform();




//        System.out.println(context.getBeanDefinitionCount());
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }


    }

}
