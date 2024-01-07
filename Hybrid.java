//hybrid
class C{
public void disp(){
System.out.println("method of class c");
}}
class A extends C{public void display()
{
System.out.println("method of class a");
}}
class B extends C{
public void display(){
System.out.println("method of class b");
}}
class D extends A{
public void disp()
{
System.out.println("method of class d");
}
public static void main(String args[]){
D ob=new D();
ob.disp();
}}