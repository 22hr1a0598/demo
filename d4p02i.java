import java.util.Scanner;
class Ascii{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a character");
char ch=sc.next().charAt(0);
int asciiValue=(int)ch;
System.out.println("Ascii value"+ch+"is"+asciiValue);
}}