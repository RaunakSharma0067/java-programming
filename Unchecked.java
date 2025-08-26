class a {
    void methoda() 
    {
        System.out.println("First line executed of a()");
        System.out.println("Second line executed of A()");
    }
}

class b {
    void methodb() throws ArithmeticException 
    {
        System.out.println("first line executed of b()");

        a Obj = new a();
        Obj.methoda();

        System.out.println("second line executed before exception of b()");

        try 
        {
            int result = 2 / 0; 
            System.out.println("result = " + result);
        }
        
        catch(ArithmeticException e) 
        {
            System.out.println("Exception: Number cannot be divided by zero!");
        }
    }
}

public class Unchecked {
    public static void main(String args[ ]) {
        System.out.println("main() stars");
        b obj = new b();
        obj.methodb();
        System.out.println("main() ends");
    }
}
