class A{
public static void main(String args[]){
int a=1;
int b=1;
int c=1;
System.out.print(a+","+b);
for(int i=2;i<=20;i++)
{c=a+b;
System.out.print(c+",");
a=b;
b=c;
}}}