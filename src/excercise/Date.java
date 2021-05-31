package excercise;
import java.util.Scanner;


public class Date {
    private int month;
    private int day;
    private int year;

    Date(int month,int day,int year){
        this.month=month;
        this.day=day;
        this.year=year;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(int day){
        return day;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
   public void displayDate(){
       System.out.printf("%d/%d/%d",month,day,year);

    }

        public static void main(String[] args) {

            Date date= new Date(03, 23, 1994);
            Date date1= new Date(04, 04, 2021);
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Month");
            int myMonth = sc.nextInt();
            date.setMonth(myMonth);

            System.out.println("Enter the Date");
            int myDay = sc.nextInt();
            date.setDay(myDay);

            System.out.println("Enter the Year");
            int myYear = sc.nextInt();
            date.setYear(myYear);

date.displayDate();
        }


}
