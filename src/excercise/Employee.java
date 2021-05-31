package excercise;

public class Employee {
    private String firstName;
    private String LastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
        if (salary < 0) this.salary = 0.0;
    }
    public double  raise(){
     double salary1=  salary*0.10;
      salary1+=salary;
      return salary1;

    }

    static class EmployeeTest {
        public static void main(String[] args) {
            Employee employee1 = new Employee("priya", "Chawla", 50000.00);
            Employee employee2 = new Employee("Anita", "Chawla", 30000.00);
            System.out.println(employee1.getFirstName());
            System.out.println(employee1.getLastName());
            System.out.println(employee1.getSalary());
            System.out.printf("%s\t\t%s\t\t%.2f", employee2.getFirstName(), employee2.getLastName(), employee2.salary);

            // give 10% raise
            System.out.println("/n");
            System.out.println("employee1 raise:"+employee1.raise());
            System.out.println("employee2 raise:"+employee2.raise());
        }
    }
}



