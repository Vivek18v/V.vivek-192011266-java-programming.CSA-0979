import java.util.*;
import java.io.*;
class pattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of rows:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int num=1;
System.out.printf("%"+(n-i)*2+ "s","");
for(int j=0;j<=i;j++)
{
System.out.printf("%4d",num);
num=num*(i-j)/(j+1);
}
System.out.println();
}
}
}
