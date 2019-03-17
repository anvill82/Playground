//import com.ivo.config.AppConfig;

import com.springinaction.springidol.Performer;
import com.springinaction.springidol.impl.Instrumentalist;
import com.springinaction.springidol.impl.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

/*
        Performer performer = context.getBean("kenny", Instrumentalist.class);
        performer.perform();
*/

        Ticket ticket = context.getBean("ticket", Ticket.class);
        System.out.println(ticket.getCat());
        //System.out.println(ticket.getOwner2());


//        System.out.println(context.getBeanDefinitionCount());
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }


    }

}
