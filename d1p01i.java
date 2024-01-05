import java.io.*;
import java.util.Scanner;
class Sub{
public static void main(String args[])
{//initializing variables
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int sum;
int sub;
int mul;
int div;
//displaying num1 num2
sum=num1+num2;
sub=num1-num2;
mul=num1*num2;
div=num1/num2;
System.out.println(num1+"+"+num2+"="+sum);
System.out.println(num1+"-"+num2+"="+sub);
System.out.println(num1+"*"+num2+"="+mul);
System.out.println(num1+"/"+num2+"="+div);

}}