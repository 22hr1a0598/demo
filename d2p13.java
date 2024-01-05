import java.util.Scanner;
class IF_Else_example1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=scob.nextInt();
int j=scob.nextInt();
if(j==0)
System.out.println("division by error");
else
System.out.println(i+"divided by"+j+"is"+(i/j));
i=i+j;
}
}