package excercise;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}

//b
class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() - (.1 * super.getSalePrice());
        } else
            return super.getSalePrice() - (.2 * super.getSalePrice());
    }
}
//c.

class Ford extends Car {
    private int year;
    private int manufacturingDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturingDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturingDiscount = manufacturingDiscount;
    }

    public double getSalePrice() {
        return (super.getSalePrice() - manufacturingDiscount);
    }
}

//d.
class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() - (.05 * super.getSalePrice());
        } else {
            return super.getSalePrice() - (.10 * super.getSalePrice());
        }
    }
}


class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(160, 20000, "Red", 10);
        Ford ford1 = new Ford(156, 4452.0, "Black", 2005, 10);
        Ford ford2 = new Ford(155, 5000.0, "Pink", 1995, 5);
        Car car = new Car(555, 56856.0, "red");
        System.out.println(sedan.getSalePrice());
        System.out.println(ford1.getSalePrice());
        System.out.println(ford2.getSalePrice());
        System.out.println(car.getSalePrice());
    }
}

