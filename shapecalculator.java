import java.util.*;
interface shape
{
 double area();
 double perimeter();
}
class Circle implements shape
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
double p=2*Math.PI*radius ;
return p;
}
}
class Rectangle implements shape
{
private double length,width;
rectangle(double length,double width)\{
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
System.out.println("2.calculate for rectangle");
System.out.println("3.exit");
System.out.println("enter your choice (1-3):");
choice=sc.nextInt();
switch(choice)
{
 case 1:
    System.out.println("\ncalculate the area and perimeter of circle");
    System.out.println("enter the radius of the circle:");
    double radius=sc.nextDouble();
    Circle cir=new Circle(radius);
    System.out.println("the area of circle with radius"+radius+"is:"+cir.area());
    System.out.println("the perimeter of circle with radius"+radius+"is:"+cir.perimeter());
     break;
 case 2:
   System.out.println("\n calculate the area and perimeter of rectangle"); 
   System.out.println("enter the length of the rectangle");
   double length=sc.nextDouble();
   System.out.println("enter the width of the rectangle:");
   double width=sc.nextDouble();
   Rectangle rec=new Rectangle(length,width);
   System.out.println("the area of the rectangle with length"+length+"and     width"+width+"is:"+rec.area());
   System.out.println("the perimeter of the rectangle with length"+length+"and width"+width+"is:"+rec.perimeter());
   break;
 case 3:
    break;
 default:
    System.out.println("invalid choice!");
 }
 }
 }
 }
 
    
 
 
