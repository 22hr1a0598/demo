import java.util.Scanner;
class Swap20{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2;
num1=sc.nextInt();//5
num2=sc.nextInt();//7
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println(num1+"\n"+num2);
}}