class mythread extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("child thread" + i);
        }
    }
}

public class thread {
    public static void main(String args[]) {
        mythread mt = new mythread();
        mt.start();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Main Class" + i);
        }
    }
}
