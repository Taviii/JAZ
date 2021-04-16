package pl.pjatk.OktWic;

import org.springframework.beans.factory.annotation.Value;

public class Pojo {
    @Value("${my.custom.property:default}")
    private final String name;
    private final int age;

    public Pojo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void soutSomething() {
        System.out.println("Something");
    }
}
