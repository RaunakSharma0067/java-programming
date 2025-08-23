import java.util.*;
interface shape{
    void area();
}

class rectangle implements shape{
    int length , width;
    rectangle(int length , int width){
        this.length=length;
        this.width=width;
    }
    public void area(){
        int area = length * width;
        System.out.println("Area Of Rectangle="+area);
    }
}

class circle implements shape{
    int radius;
    circle(int radius){
        this.radius=radius;
    }
    public void area(){
        double area=3.14 * radius * radius;
        System.out.println("Area of circle="+area);
    }
}

public class shapearea {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length=");
int length=sc.nextInt();
System.out.println("Enter the Width=");
int width=sc.nextInt();
shape ob1=new rectangle(length, width);
ob1.area();

System.out.println("Enter The Radius Of Circle");
int radius=sc.nextInt();
shape ob2=new circle(radius);
ob2.area();
}    
}
