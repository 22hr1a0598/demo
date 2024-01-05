import java.util.Scanner;
class Swap{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2;
num1=sc.nextInt();//5
num2=sc.nextInt();//7
int temp;
temp=num1;//temp=5
num1=num2;//num1=7
num2=temp;//num2=5
System.out.println(num1+"\n"+num2);
}}