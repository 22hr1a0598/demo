//with arguments without return values
import java.util.Scanner;
class A{
public void display()
//no arg no return values
{
System.out.println("+:Add");
System.out.println("-:sub");
System.out.println("*:mul");
System.out.println("/:div\n*:mul");
}
public void add(int a,int b){
//with arg no return value
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}}
class S{
public static void main(String args[]){
A a=new A();
a.display();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
a.add(n1,n2);
}
}
