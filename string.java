import java.util.*;
class string
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("first string is:");
String str1=sc.nextLine();
System.out.println("second string is:");
String str2=sc.nextLine();
System.out.println("String compare"+str1.compareTo(str2));
System.out.println("String length"+str1.length());
System.out.println("String length"+str2.length());
System.out.println("String concatenate"+str1.concat(str2));
System.out.println("string to lowercase"+str1.toLowerCase());
System.out.println("string to uppercase"+str2.toUpperCase());
String copy=str1;
System.out.println("String copy="+copy);
}
}
