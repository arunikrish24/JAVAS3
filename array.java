import java.util.*;
class array
{
public static void main(String args[])
{
int n,i,choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements:");
n=sc.nextInt();
sc.nextLine();
String[] strArray=new String[n];
System.out.println("Enter\t" +n+ "\tString");
for(i=0;i<n;i++)
{
System.out.println("Enter the string" +(i+1));
strArray[i]=sc.nextLine();
}
while(true)
{
System.out.println("1.Search a string");
System.out.println("2.Sort array:");
System.out.println("3.Exit");
System.out.println("Enter your choice");
choice=sc.nextInt();
sc.nextLine();
switch(choice)
{
case 1:
      System.out.println("Enter the string:");
      String search=sc.nextLine();
      searchString(strArray,search);
      break;
case 2:
      sortArray(strArray);
      System.out.println("Array sort sucessfully.");
      System.out.println("Sort array" +Arrays.toString(strArray));
      break;
case 3:
      System.out.println("Exit from program.");
      return;
}
}
}
public static void searchString(String[] array,String search)
{
boolean found=false;
for(String str:array)
{
if(str.equalsIgnoreCase(search))
{
found=true;
break;
}
}
if(found)
{
System.out.println("string\t" +search+ "\tis found in the array.");
}
else
{
System.out.println("string\t" +search+ "\tis not found!.");
}
}
public static void sortArray(String[] array)
{
Arrays.sort(array);
}
}




