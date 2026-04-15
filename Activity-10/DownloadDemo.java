class Download extends Thread {
    static int progress = 0;

    public void run() {
        for (int i = 0; i <= 100; i++) {
            progress = i;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class Display extends Thread {
    public void run() {
        while (true) {
            System.out.println("Progress: " + Download.progress + "%");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            if (Download.progress == 100) {
                break;
            }
        }
    }
}

public class DownloadDemo {
    public static void main(String[] args) {
        Download d = new Download();
        Display dis = new Display();

        d.start();
        dis.start();
    }
}