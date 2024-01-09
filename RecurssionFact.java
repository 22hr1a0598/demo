//calling a function within its definition is recursive function
import java.util.Scanner;
class D{
public int calculateFact(int n)
{
if(n==0)return 1;
else
return n*calculateFact(n-1);
}
}
class T{
c
int p=sc.nextInt();
D d=new D();
System.out.println(d.calculateFact(p));
}}