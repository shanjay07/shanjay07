import java.io.*
import java.util;
public class leapyear
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the year:");
int year=s.nextInt();
boolean flag=flase;
if(year%400==0)
{
flag=true;
}
elseif(year%100=0)
{
flag=flase;
}
elseif(year%4==0)
{
flag=true;
}
else
{
flag=flase;
}
if(flag)
{
System.out.println("Year"+year+"is a leap year")
}
else
{
System.out.println("Year"=year+"is not a leap year")
}
}
}
