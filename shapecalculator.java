import java.util.*;
interface shape
{
double area();
double perimeter();
}
class circle implements shape
{
private double radius;
circle(double radius)
{
this.radius=radius;
}
public double area()
{
double a=Math.PI*radius*radius;
return a;
}
public double perimeter()
{
double p=2*Math.PI*radius;
return p;
}
}
class rectangle implements shape
{
private double length,width;
rectangle(double length,double width)
{
this.length=length;
this.width=width;
}
public double area()
{
return length*width;
}
public double perimeter()
{
return 2*(length+width);
}
}
class shapecalculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice=0;
while(choice!=3)
{
System.out.println("\nshape calculator menu");
System.out.println("1.calculate for circle");
System.out.println ("2.calculate for rectangle");
System.out.println ("3.exit");
System.out.print("enter your choice:(1-3):");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("\ncalculate area and perimeter of circle");
System.out.print("enter radius of circle:");
double radius=sc.nextDouble();
shape Circle=new circle(radius);
System.out.println ("the area of circle with radius"+radius+"is:"+Circle.area());
System.out.println ("the perimeter of circle with radius"+radius+"is:"+Circle.perimeter());
break;

case 2:
System.out.println("\ncalculate area and perimeter of rectangle");
System.out.print("enter length of rectangle:");
double length=sc.nextDouble();
System.out.print("enter the breadth of rectangle:");
double breadth=sc.nextDouble();
rectangle rectangle=new rectangle(length,breadth);
System.out.println ("the area of rectangle with length"+length+"and breadth"+breadth+"is:"+rectangle.area());
System.out.println ("the perimeter of rectangle with length"+length+"and breadth"+breadth+"is:"+rectangle.perimeter());
break;
case 3:
System.out.println("exiting the program!");
break;
default:
System.out.println("invalid choice!please enter a choice between(1-3)!");
}
}
}
}




