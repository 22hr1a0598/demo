//calling a function within its definition is recursive function
import java.util.Scanner;
class D{
public long calculateFact(int n)
{
long res=1;
if(n==0)return 1;
else
{
for(int i=1;i<=n;i++)res=res*i;
return res;}//else
}
}
class T{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
D d=new D();
System.out.println(d.calculateFact(p));
}}