package rank;
class Mythread1 implements Runnable{
    public void run(){
        System.out.println("I am a thread not a threat 1 ");
        System.out.println("I am a thread not a threat 1 ");
        System.out.println("I am a thread not a threat 1 ");
        System.out.println("I am a thread not a threat 1 ");
        System.out.println("I am a thread not a threat 1 ");
    }
}
class Mythread2 implements Runnable{
    public void run(){
        System.out.println("I am a thread not a threat 2");
        System.out.println("I am a thread not a threat 2");
        System.out.println("I am a thread not a threat 2");
        System.out.println("I am a thread not a threat 2");
        System.out.println("I am a thread not a threat 2");
        System.out.println("I am a thread not a threat 2");
        System.out.println("I am a thread not a threat 2");
    }
}
public class priya71 {
    public static void main(String[] args) {
   //Mythread1 bullet1= new Mythread1();
  // Thread gun1 =new Thread(bullet1);
    Mythread2 bullet2= new Mythread2();
        Thread gun2 =new Thread(bullet2);
    //    gun1.start();
        gun2.start();
    }
}
