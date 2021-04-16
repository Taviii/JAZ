package pl.pjatk.OktWic;

import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {
    public MyThirdComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent) {
        System.out.println("And this is MyThirdComponent");
        myFirstComponent.printHelloFromMethod();
        mySecondComponent.printFromSecond();
    }
}
