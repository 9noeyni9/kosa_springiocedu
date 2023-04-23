package exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyApp {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("bean2.xml");

        Student stu1 = (Student) factory.getBean("st1");
        System.out.println(stu1.getName() + "는 " + stu1.getMyHomework().getHomeworkName() + "를 학습합니다.");

        Student stu2 = (Student) factory.getBean("st2");
        System.out.println(stu2.getName() + "는 " + stu2.getMyHomework().getHomeworkName() + "를 학습합니다.");

        Student stu3 = (Student) factory.getBean("st3");
        System.out.println(stu2.getName() + "는 " + stu3.getMyHomework().getHomeworkName() + "를 학습합니다.");

        ((ClassPathXmlApplicationContext)factory).close();
    }

}
