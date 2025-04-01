import java.util.*;
class arithmetic
{
  public static void main(String args[])
  {
    int n1,n2;
    int sum=0,diff=0,prod=0,div=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers");
    n1=sc.nextInt();
    sc.nextLine();
    n2=sc.nextInt();
    sum=n1+n2;
    diff=n1-n2;
    prod=n1*n2;
    div=n1%n2;
    System.out.println("sum"+sum);
    System.out.println("diff"+diff);
    System.out.println("prod"+prod);
    System.out.println("div"+div);
  }
}
    
