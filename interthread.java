class PC {
    boolean flag = false;
    int item;

    synchronized public void put(int item) {
        if (flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.item = item;
        System.out.println("Put :" + item);
        flag = true;
        notify();
    }

    synchronized public void get() {
        if (flag == false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Get :" + item);
        flag = false;
        notify();
    }

}

class P extends Thread {
    PC PC;

    P(PC PC) {
        this.PC = PC;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            PC.put(i);
        }
    }
}

class C extends Thread {
    PC PC;

    C(PC PC) {
        this.PC = PC;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            PC.get();
        }
    }
}

public class interthread {
    public static void main(String args[]) {
        PC PC = new PC();
        C C = new C(PC);
        P P = new P(PC);

        C.start();
        P.start();
    }
}
