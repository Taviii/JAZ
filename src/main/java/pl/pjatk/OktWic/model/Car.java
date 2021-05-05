package pl.pjatk.OktWic.model;

public class Car {

    private String name;

    //nie działało bo nie miało pustego konstruktora
    public Car(){}

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car newName(Car car){
        return new Car("XD");
    }
}
