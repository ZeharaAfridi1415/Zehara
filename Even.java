import java.io.*;
import java.util.*;
public class Even
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
int i1=Integer.parseInt(str);
for(int i=0;i<str.length();i++)
{
if(str%2==0)
{
System.out.println("EVEN");
}
else
{
System.out.println("ODD");
}
}
}
}
