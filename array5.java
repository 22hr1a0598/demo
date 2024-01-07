import java.util.Scanner;
class Search_Element
{
public static void main(String args[])
{
int n,x, flag=0,i=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the elements to be find:");
x=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println(" Elements found at the position:"+(i+1));
}
else
{
System.out.println(" Elements not found" );
}
}
}