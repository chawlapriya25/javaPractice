package Constructor;

public class Person {
    private String name;
    private int age;
    private Address address;
    private final static String DEFAULT_NAME = "John Doe";

    public Person() {
        this("John Doe");
        address= new Address();

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public Person(String name) {
        this.name = name;
        address= new Address();

    }
    public Person(String name,int age){
        this();
        this.age=age;
        address= new Address();
    }
}
