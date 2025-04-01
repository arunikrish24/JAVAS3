import java.util.*;
class cpu
{
 float price;
 cpu(Scanner sc)
 {
  System.out.println("Enter the cpu price:");
  price=sc.nextFloat();
 }
class processor
{
 int cores;
 String manufacturer;
 processor(Scanner sc)
 { 
  System.out.println("Enter no of Cores");
  cores=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the Manufacturer");
  manufacturer=sc.nextLine();
 }
}
static class ram
{
 int memory;
 String manufacturer;
 ram(Scanner sc)
 {
  System.out.println("Enter the memory");
  memory=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the manufacturer");
  manufacturer=sc.nextLine();
 }
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 cpu cpu=new cpu(sc);
 cpu.processor p=cpu.new processor(sc);
 cpu.ram r=new cpu.ram(sc);
 System.out.println("the price is"+cpu.price);
 System.out.println("The no of Cores is:"+" "+p.cores+" "+"and the Manufacturer is:"+" "+p.manufacturer);
 System.out.println("Memory is:"+" "+r.memory+"gb ram Manufacturer"+" "+r.manufacturer);
}
}
 
