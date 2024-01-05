import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Arithematic{
public static void main(String args[])
{//initializing variables
Scanner sc=new Scanner(System.in);
double num1=sc.nextDouble();
double num2=sc.nextDouble();
double sum;
double sub;
double mul;
double div;
double mod;
//displaying num1 num2
sum=num1+num2;
sub=num1-num2;
mul=num1*num2;
div=num1/num2;
if(num2==0)
System.out.println("division is not pissible");

mod=num1%num2;
System.out.println(num1+"+"+num2+"="+sum);
System.out.println(num1+"-"+num2+"="+sub);
System.out.println(num1+"*"+num2+"="+mul);
System.out.println(num1+"/"+num2+"="+div);
System.out.println(num1+"%"+num2+"="+mod);

}}