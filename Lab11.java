interface a {
    void show();
}

interface b {
    void display();
}

class c implements a, b {
    public void show() {
        System.out.println("show() in class c");
    }

    public void display() {
        System.out.println("display() in class c");
    }
}

public class Lab11 {
    public static void main(String[] args){
        a obj1 = new c();
        b obj2 = new c();
        obj1.show();
        obj2.display();
    }
}
