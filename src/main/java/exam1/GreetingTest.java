package exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

public class GreetingTest {
    public static void main(String[] args) {
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("exam1.xml");

        LocalDateTime time = (LocalDateTime)factory.getBean("localDateTime");

        System.out.println(time.getHour());

        if(time.getHour()>=6 && time.getHour()<=12){
            Greeting morning = (Greeting)factory.getBean("morningGreeting");
            morning.greet();
        } else if (time.getHour()>12 && time.getHour()<=17) {
            Greeting afternoon = (Greeting)factory.getBean("afternoonGreeting");
            afternoon.greet();
        } else if (time.getHour()>17&&time.getHour()<=22) {
            Greeting evening = (Greeting) factory.getBean("eveningGreeting");
            evening.greet();
        }else{
            Greeting night = (Greeting) factory.getBean("ningtGreeting");
            night.greet();
        }
    }
}
/*변수선언 한번으로 끝내보는 거 추천*/
