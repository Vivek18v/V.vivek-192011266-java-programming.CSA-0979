import java.util.*;
import java.io.*;

class username
{
public static void main(String args[])
{
 
Scanner input=new Scanner(System.in);
System.out.println("enter the username:");
String un1=input.nextLine();	
System.out.println("Re-enter the username:");
String un2=input.nextLine();
if(un1.equals(un2))
{
System.out.println("username valid");
}
else
{
System.out.println("username invalid");
}
 
}
}
