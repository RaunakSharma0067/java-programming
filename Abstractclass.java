abstract class a {
    abstract void show();

    void display() {
        System.out.println("hello i am display from class a");
    }
}

class b extends a {
    void show() {
        System.out.println("Hello I Am Abstract(show) Implemented In Class B");
    }
}

public class Abstractclass {
    public static void main(String args[]) {
        b obj = new b();
        obj.show();
        obj.display();
    }
}
