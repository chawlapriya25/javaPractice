package rank;
class myThread1 extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<4) {
            System.out.println("My threading is bad");
            System.out.println("working");
            i++;
        }
    }
}
            class myThread2 extends Thread {
                @Override
                public void run() {
                    int i=0;
                    while (i<4) {
                        System.out.println("thread is good");
                        System.out.println("i am somthig");
                        i++;
                    }
                }
            }
        public  class multithreading {
                public static void main(String[] args) {
                    myThread1 t1 = new myThread1();
                    myThread2 t2 =new myThread2();
                    t1.start();
                    t2.start();
                }
            }
