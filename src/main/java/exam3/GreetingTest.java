package exam3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

public class GreetingTest {
    public static void main(String[] args) {
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("exam3.xml");

        LocalDateTime time = (LocalDateTime)factory.getBean("localDateTime");


        System.out.println(time.getHour());

        Greeting gr;
        if(time.getHour()>=6 && time.getHour()<=12){
            gr = factory.getBean("morning",Greeting.class);
            gr.greet();
        } else if (time.getHour()>12 && time.getHour()<=17) {
            gr = factory.getBean("afternoon",Greeting.class);
            gr.greet();
        } else if (time.getHour()>17&&time.getHour()<=22) {
            gr = factory.getBean("evening",Greeting.class);
            gr.greet();
        }else{
            gr = factory.getBean("night",Greeting.class);
            gr.greet();
        }
        ((ClassPathXmlApplicationContext) factory).close();
    }
}
/*변수선언 한번으로 끝내보는 거 추천*/
