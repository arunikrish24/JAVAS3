import java.util.*;
class product
{
 int pcode;
 float price;
 String pname;

void getdata()
 {
  System.out.println("enter pcode,pname,price");
  Scanner sc=new Scanner(System.in);
  this.pcode=sc.nextInt();
  sc.nextLine();
  this.pname=sc.nextLine();
  sc.nextLine();
  this.price=sc.nextFloat();
  
 }
 void displaydata()
 {
  System.out.println("pcode"+pcode);
  System.out.println("pname"+pname);
  System.out.println("price"+price);
 }
}
class Product
{
 public static void main(String args[])
 {
  product p1=new product();
  product p2=new product();
  product p3=new product();
  p1.getdata();
  p2.getdata();
  p3.getdata();
  p1.displaydata();
  p2.displaydata();
  p3.displaydata();
 
 if((p1.price<p2.price)&&(p1.price<p3.price))
 {
  System.out.println("p1 is smaller");
 }
 else if((p2.price)<(p3.price))
 {
  System.out.println("p2 is smaller");
 }
 else
 {
  System.out.println("p3 is smaller");
 }
}
}


