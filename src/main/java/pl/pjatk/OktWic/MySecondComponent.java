package pl.pjatk.OktWic;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
    public MySecondComponent(MyFirstComponent myFirstComponent) {
        System.out.println("Hello from MySecondComponent");
//        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class); //szukaj w aplikacji z wszystkich komponentów to co ma "" nazwę i zrzutuj na te klasę MFC
        myFirstComponent.printHelloFromMethod();
    }

    public void printFromSecond(){
        System.out.println("Hello, I'm method from SecondComponent");
    }
}
