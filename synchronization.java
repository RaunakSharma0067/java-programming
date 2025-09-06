class display{
    synchronized public void display(){
        for(int i = 1 ; i <= 5 ; i++)
        {
            System.out.println(Thread. currentThread().getName()+":"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}

class B extends Thread{
    display d;
    B(display d){
        super("B Thread");
        this.d=d;
    }
    public void run(){
    d.display();
}

}


class A extends Thread{
    display d;
    A(display d){
        super("A Thread");
        this.d=d;
    }
    public void run(){
        d.display();
    }
}

public class synchronization {
    public static void main(String args[]){
        display d = new display();
        A ob1 = new A(d);
        B ob2 = new B(d);

        ob1.start();
        ob2.start();
    }
}
