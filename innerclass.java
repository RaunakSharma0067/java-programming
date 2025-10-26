//Inner classes allow better code organization and encapsulation. Here’s how you can create and access a non-static inner class using an instance of the outer class.


class outer {
    class inner {
        void show() {
            System.out.println("Show() in Inner Class Inside The Outer");
        }
    }
}

public class innerclass {
    public static void main(String args[]) {
        outer.inner obj = new outer().new inner();
        obj.show();
    }
}
