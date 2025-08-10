// Multi-Level Inheritance In Java
class a {
    void print() {
    System.out.println("hi i am class a(hi i'm parent)");
    }
}

class b extends a {
    void display() {
    System.out.println("hi i am class b(hi i'm child of a)");
    }
}

class c extends b {
    void show() {
    System.out.println("hi i am class c(i'm child of a and b)");
    }
}

class multipleinheritance {
    public static void main(String[] args) {
        c obj = new c();
        obj.show();
        obj.print();
        obj.display();
    }
}
