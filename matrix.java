import java.util.*;
class matrix
{
 public static void main(String args[])
 {
  int a[][],b[][],c[][],i,j,k;
  a=new int [3][3];
  b=new int [3][3];
  c=new int [3][3];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first matrix:");
  for(i=0;i<3;i++)
   for(j=0;j<3;j++)
     a[i][j]=sc.nextInt();
     
  System.out.println("Enter the second matrix:");
  for(i=0;i<3;i++)
   for(j=0;j<3;j++)
    b[i][j]=sc.nextInt();
    
  System.out.println("matrix addition");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    c[i][j]=a[i][j]+b[i][j];
   }
  }
 
   
  
  for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
    {
     System.out.print(c[i][j]+"\t");
    }
    System.out.println();
   }
    
  System.out.println("matrix multiplication");
  for(i=0;i<3;i++)
  
   for(j=0;j<3;j++)
    for(k=0;k<3;k++)
    {
     c[i][j]=0;
     c[i][j]+=a[i][j]*b[i][j];
    }
  
   for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
    {
     System.out.print(c[i][j]+"\t");
    }
    System.out.println();
   }
 }
}
     
  
