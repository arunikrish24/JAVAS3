import java.util.*;
class employee
{
 int eno;
 String ename;
 int esalary;
 public employee(int eno,String ename,int e salary)
 {
  this.eno=eno;
  this.ename=ename;
  this.esalary=esalary;
 } 
public void display()
{
 System.out.println("eno= "+eno);
 System.out.println("ename= "+ename);
 System.out.println("esalary= "+esalary);
}
}
class search
{
 public static void main(String args[])
 {
  int i,n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of employees:");
  n=sc.nextInt();
  employee[] employee=new employee[n];
  for(i=0;i<n;i++)
  {
   System.out.println("Enter the details of employees:");
   System.out.println("Enter employee number:");
   int eno=sc.nextInt();
   System.out.println("Enter employee name:");
   sc.nextLine();
   String ename=sc.nextLine();
   System.out.println("Enter employee salary:");
   int esalary=sc.nextInt();
   employee[i]=new employee(eno,ename,esalary);
  }
 System.out.println("Search the employees in the company:");
 int searcheno;
 searcheno=sc.nextInt();
 boolean found=false;
 for(employee emp:employee)
 {
  if(emp.eno==searcheno)
 {
  emp.display();
  found=true;
  break;
 }
 }
 if(!found)
 {
  System.out.println("not found!");
 }
 }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
