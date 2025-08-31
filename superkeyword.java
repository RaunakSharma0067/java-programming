// SUPER KEYWORD VS THIS KEYWORD
class a {
    int a = 10;
}

class b extends a {
    int a = 100;

    void show() {
        int a = 1000;
        System.out.println("A in show()=" + a);

        System.out.println("A in show() By this keyword=" + this.a);

        System.out.println("A in show() By Super Keyword=" + super.a);

    }
}

public class superkeyword {
    public static void main(String args[]) {
        b object = new b();
        object.show();
    }
}
