class Thread1 extends Thread {
    public void run(){
        for (int i = 1 ; i <=5 ; i++ ){
            System.out.println(i);
        }
    }
}

class Thread2 extends Thread {
    public void run(){
        for (int i = 100 ; i <= 105 ; i ++){
            System.out.println(i);
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) throws InterruptedException{
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}