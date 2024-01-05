import java.util.Scanner;
class ProDig{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int n;
int pd=1;
System.out.print("enter no");
n=sc.nextInt();
while(n>0){
pd=pd*(n%10);
n=n/10;}
System.out.print(pd);

}}