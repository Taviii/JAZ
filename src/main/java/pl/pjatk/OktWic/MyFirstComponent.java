package pl.pjatk.OktWic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {
    public MyFirstComponent(
            Pojo pojo,
            List<String> defaultData,
            @Value("${my.custom.random: random value}") String property
    ) {
//        System.out.println("Hello from MyFirstComponent");
//        pojo.soutSomething();
//        System.out.println(pojo.getName());
//        System.out.println(defaultData);
        System.out.println(property);
    }

    public void printHelloFromMethod() {
        System.out.println("Hello from MyFirstComponent.printHelloFromMethod()");
    }
}
