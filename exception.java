import java.util.*;

public class exception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("main() starts");
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        try 
        {
            int data = 10 / num;
            System.out.println(data);
        } 
        catch (ArithmeticException e) 
        {
          System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
        catch(NullPointerException e){
        System.out.println("NullPointerException: Attempted to use an uninitialized object.");
        }
        catch(Exception e)
        {
          System.out.println("Generic Exception caught: " + e);
        }
        finally
        {
            System.out.println("Resource Cleanup Completed");
        }
        System.out.println("main() ends");
        sc.close();
    }
}
