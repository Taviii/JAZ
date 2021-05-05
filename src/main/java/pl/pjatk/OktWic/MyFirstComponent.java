package pl.pjatk.OktWic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

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
