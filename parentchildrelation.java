class parent { // creating a parent class with show method
    void show() {
        System.out.println("hi i am print method called from parent class");
    }
}

class child extends parent { // create a child class with inheritance relation and it have method display
    void display() {
        System.out.println("hi i am print method called from parent class");
    }
}

public class parentchildrelation {
    public static void main(String[] args) {
        parent p = new parent();// creating parent object
        child c = new child();// creating child object

        p.show(); // calling parent method from parent class with parent's object(possible)
        //p.display();// calling child method from parent class with parent's object(Not possible)

        c.show();// calling parent method from parent class with child's object(possible)
        c.display();// calling child method from child class with child's object(possible)
    }
}