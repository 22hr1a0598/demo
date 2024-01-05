import java.io.*;
import java.util.Scanner;
class Diff{
public static void main(String args[])
{//initializing variables
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int difference;
//displaying num1 num2
//int difference=Math.abs(num1-num2)
difference=num1-num2;
if(num1<num2)
System.out.println(num2-num1);
else
System.out.println(difference);
}}