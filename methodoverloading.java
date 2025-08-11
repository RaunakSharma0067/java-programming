class a {
    int a, b;

    void sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void show() {
        System.out.println("via class a (a+b)=" + (a + b));
    }
}

class b extends a {
    int c;

    void sum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show() {
        System.out.println("via class a (a+b+c)=" + (a + b + c));
    }
}

class methodoverloading {
    public static void main(String[] args) {
        b obj = new b();
        obj.sum(10, 20);
        obj.show();
        obj.sum(10, 20, 30);
        obj.show();
    }
}