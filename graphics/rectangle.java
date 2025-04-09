package graphics;
interface figure
{
double area();
void display();
}
public class rectangle implements figure
{
double length;
double width;
rectangle(double length,double width)
{
this.length=length;
this.width=width;
}
public double area()
{
return length*width;
}
public void display()
{
System.out.println("rectangle [length="+length+",width="+width+"]");
}
}
