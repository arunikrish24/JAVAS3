import java.util.*;
class areacalculator
{
double calculatearea(double radius)
{
return Math.PI*radius*radius;
}
double calculatearea(double length,double width)
{
return length*width;
}
double calculatearea(double base1,double base2,double height)
{
return 0.5*(base1+base2)*height;
}
}
public class areamain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
areacalculator ac=new areacalculator();
System.out.print("enter radius of the circle:");
double radius=sc.nextDouble();
System.out.println("area of circle with radius ("+radius+"): "+ac.calculatearea(radius));
System.out.print("enter length of the rectangle:");
double length=sc.nextDouble();
System.out.print("enter width of the rectangle:");
double width=sc.nextDouble();
System.out.println("area of rectangle with length("+length+") and width("+width+") is: "+ac.calculatearea(length,width)); 
System.out.print("enter base1 of the trapezoid: ");
double base1=sc.nextDouble();
System.out.print("enter base2 of the trapezoid: ");
double base2=sc.nextDouble();
System.out.print("enter height of the trapezoid:");
double height=sc.nextDouble();
System.out.println("area of trapezoid with base("+base1+"), base("+base2+") and height("+height+") is : "+ac.calculatearea(base1,base2,height)); 

}
}



