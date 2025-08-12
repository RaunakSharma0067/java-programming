class parent {
    int a, b;

    void papa() {
        System.out.println("hi i am baap of a and called via class a");
    }
}

class child extends parent {
    int c;

    void papa() {
        System.out.println("hi i am betwa of my papa which is declared in class a but i am called from class b");
    }
}

public class methodoveriding {
    public static void main(String[] args) {
        parent obj = new child();
        obj.papa();
    }
}
