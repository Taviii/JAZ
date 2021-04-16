package pl.pjatk.OktWic;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Pojo pojo() {
        System.out.println("Hello from Pojo :D");
        return new Pojo("pojo1", 11);

    }

    @Bean
    public List<String> defaultData() {
        return List.of("1", "2", "3", "4", "5");
    }


    @Bean
    @ConditionalOnProperty(value = "someValue", havingValue = "true")
    public ThisIsTrue thisIsTrueString() {
        return new ThisIsTrue("Lol, I'm true, told ya");
    }
}
