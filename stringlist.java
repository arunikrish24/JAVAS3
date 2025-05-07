import java.util.*;
class stringlist
{
public static void main(String args[])
{
ArrayList<String>st=new ArrayList<>();
Scanner sc=new Scanner(System.in);
st.add("bat");
st.add("ball");
st.add("cap");
System.out.println("Initial list:"+st);
System.out.println("Enter a string:");
String input=sc.nextLine();
st.add(input);
System.out.println("List after adding:"+st);
st.remove("bat");
System.out.println("List after removing 'bat':"+st);
Collections.sort(st);
System.out.println("Initial list:"+st);
System.out.println("Enter a string to search:");
String search=sc.nextLine();
if(st.contains(search))
{
System.out.println(search+ " is in the list");
}
else
{
System.out.println(search+ " is not in the list");
}
}
}
