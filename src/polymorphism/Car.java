package polymorphism;

public class Car {
    private String name;
    boolean engine = true;
    private int cylinder;
    private int wheels = 4;


    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }


    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
    }

    public String startEngine() {
        return "Base Car--->please start the engine";
    }

    public String accelerate() {
        return "Base Car--->foor on acclertion";
    }

    public String brake() {
        return "Base Car--->to make it slow pres brakes";
    }
}


class honda extends Car {
    public honda(String name, int cylinder) {
        super(name, cylinder);
    }

    public String startEngine() {
        return "honda--> please put the key in to start the engine";
    }

    public String accelerate() {
        return "honda-->left foot on acclertion";
    }

    public String brake() {
        return "honda-->good brakes";
    }

}

class hyundai extends Car {
    public hyundai(String name, int cylinder) {

        super(name, cylinder);
    }

    public String startEngine() {
        return "hyundai--> 1 engine";
    }

    public String accelerate() {
        return "hyundai-->speed up acclertion";
    }

    public String brake() {
        return "hyundai-->bad brakes";
    }


    public static void main(String[] args) {
        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        honda Honda = new honda("oulander vrx", 6);
        System.out.println(Honda.accelerate());
        System.out.println(Honda.startEngine());
        System.out.println(Honda.brake());

        hyundai hy = new hyundai("Holden commodre", 4);
        System.out.println(hy.startEngine());
        System.out.println(hy.accelerate());
        System.out.println(hy.brake());
    }

}





