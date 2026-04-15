class ComputeTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int result = i * i;
            System.out.println("Compute: " + i + "^2 = " + result);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class LogTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Log: iteration " + i + " completed");
            try { Thread.sleep(700); } catch (Exception e) {}
        }
    }
}

class DisplayTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Display: showing value " + i);
            try { Thread.sleep(600); } catch (Exception e) {}
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ComputeTask());
        Thread t2 = new Thread(new LogTask());
        Thread t3 = new Thread(new DisplayTask());

        t1.start();
        t2.start();
        t3.start();
    }
}