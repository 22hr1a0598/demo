//calling a function within its definition is recursive function
import java.util.Scanner;
class D{
public long calculateFact(int n)
{
if(n==0)return 1;
else
return n*calculateFact(n-1);
}
}
class T{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
D d=new D();
System.out.println(d.calculateFact(p));
}}