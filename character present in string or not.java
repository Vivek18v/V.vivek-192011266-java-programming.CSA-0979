import java.util.*;
import java.io.*;
class index{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the word");
String chr= sc.nextLine();
System.out.println("enter searching letter");
char sce= sc.next().charAt(0);
int index=-1;
for(int i=0;i<chr.length();i++)
{
if(chr.charAt(i)==sce)
{
index=i;
break;
}
}
if(index==-1)
{
System.out.println("character is not present");
}
else
{
System.out.println("character is present at" +index);
}
}
}
