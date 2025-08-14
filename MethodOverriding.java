class Parent {
    int a, b;

    void display() {
        System.out.println("This is the display method of the Parent class.");
    }
}

class Child extends Parent {
    int c;

    @Override
    void display() {
        System.out.println("This is the overridden display method of the Child class.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();  // Parent reference, Child object
        obj.display(); // Calls overridden method in Child
    }
}
