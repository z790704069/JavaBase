package com.kooola.java.base.ioc;

/**
 * Created by march on 2018/7/12.
 */
public class Car {
    private Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String toString(){
        return "engine: " + this.engine.getName();
    }

    public static void main(String[] args){
        Engine engine = new Engine(0, "V8");
        Car car = new Car(engine);
        System.out.println(car.toString());
        Engine engine1 = new Engine(1, "V6");
        car.setEngine(engine1);
        System.out.println(car.toString());
    }
}
