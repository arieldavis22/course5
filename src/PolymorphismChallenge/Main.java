package PolymorphismChallenge;

import Polymorphism.*;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<11;i++) {
            Car car = randomCar();
            System.out.println("Movie #" + i + " : " +
                    car.getName() + "\n" +
                    "Plot: " + car.startEngine() + "\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number is " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Tesla();

            case 2:
                return new Buggy();

            case 3:
                return new Wagon();
        }
        return null;
    }
}

class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Engine has not been started";
    }

    public void accelerate() {
        System.out.println(this.name + " has sped up");
    }

    public void brake() {
        System.out.println(this.name + " has slowed down");
    }
}

class Tesla extends Car {
    public Tesla() {
        super("Tesla", 2);
    }

    @Override
    public String startEngine() {
        return "Tesla engine has started";
    }
}

class Buggy extends Car {
    public Buggy() {
        super("Buggy", 3);
    }

    @Override
    public String startEngine() {
        return "Buggy engine has started";
    }
}

class Wagon extends Car {
    public Wagon() {
        super("Wagon", 5);
    }
}
