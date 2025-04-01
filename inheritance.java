import java.util.*;
class Person
{
 String name,gender,address;
 int age;
 Person(String name,String gender,String address,int age)
{
 this.name = name;
 this.gender=gender;
 this.address=address;
 this.age=age;
}
}
class Employee extends Person
{
 int empid,salary;
 String Company_name,qualification;
 Employee(String name,String gender,String address,int age,int empid,int salary,String Company_name,String qualification)
{
 super(name,gender,address,age);
 this.empid=empid;
 this.salary=salary;
 this.Company_name=Company_name;
 this.qualification=qualification;
}
}
class Teacher extends Employee
{
 String subject,dept;
 int tr_id;
 Teacher(String name,String gender,String address,int age,int empid,int salary,String Company_name,String qualification,String subject,String dept,int tr_id)
{
 super(name,gender,address,age,empid,salary,Company_name,qualification);
 this.subject=subject;
 this.dept=dept;
 this.tr_id=tr_id;
}
void display(){
 System.out.println("Name:"+name);
 System.out.println("Gender:"+gender);
 System.out.println("Address:"+address);
 System.out.println("Age:"+age);
 System.out.println("Emp_id:"+empid);
 System.out.println("Salary:"+salary);
 System.out.println("Company Name:"+Company_name);
 System.out.println("Qualification:"+qualification);
 System.out.println("Subject:"+subject);
 System.out.println("Department:"+dept);
 System.out.println("Teacher id:"+tr_id);
}
 }
class inheritance
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of teachers");
  int n=sc.nextInt();
  sc.nextLine();
  Teacher[] teachers=new Teacher[n];
  for(int i=0;i<n;i++)
  {
  System.out.println("Enter details for teacher"+(i+1));
  System.out.println("Enter the name");
  String name=sc.nextLine();
  System.out.println("Enter the gender");
  String gender=sc.nextLine();
  System.out.println("Enter the address");
  String address=sc.nextLine();
  System.out.println("Enter the age");
  int age=sc.nextInt();
  System.out.println("Enter the empid");
  int empid=sc.nextInt();
  System.out.println("Enter the salary");
  int salary=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the company name");
  String Company_name=sc.nextLine();
  System.out.println("Enter the qualification");
  String qualification=sc.nextLine();
  System.out.println("Enter the subject");
  String subject=sc.nextLine();
  System.out.println("Enter the dept");
  String dept=sc.nextLine();
  System.out.println("Enter the teacher id");
  int tr_id=sc.nextInt();
  teachers[i]=new Teacher(name,gender,address,age,empid,salary,Company_name,qualification,subject,dept,tr_id);
  }
  System.out.println("Details of teacher");
  for(int i=0;i<n;i++)
  {
  teachers[i].display();
  }
  }
  }
  
  
