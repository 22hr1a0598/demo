import java.util.Scanner;
class SI{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int P=sc.nextInt();
double r=sc.nextDouble();
double t=sc.nextDouble();
double si=P*t*r/100;
System.out.println(si);
}}