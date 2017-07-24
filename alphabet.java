import java.io.*;
import java.util.*;
public class alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a=s.next();
char ch[]=a.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(Character.isLetter(ch[i]))
{
System.out.println("Is a Alphabet");
}
else
{
System.out.println("Not a Alphabet");
}
}
}
}
