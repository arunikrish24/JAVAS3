package graphics;
interface figure
{
double area();
void display();
}
class triangle implements figure
{
 public double a;
 public double b;
 public double c;
 public triangle(double a,double b,double c)
 {
 this.a=a;
 this.b=b;
 this.c=c;
 }
 public double area()
 {
  double p=(a+b+c)/2;
  return Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }
  public void display()
  {
   System.out.println("triangle [sides="+a+","+b+","+c+"]");
   }
   }
