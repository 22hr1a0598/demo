abstract  class A{
public void dis1(){
System.out.println("concrete method of parent class");
}
abstract public  void dis2();
}
class D extends A{
/* must override this method while extending a */
public void dis2()
{
System.out.println("overriding abstract method");
}
}
class T{
public static void main(String args[]){
A obj;
obj=new D();
obj.dis1();
obj.dis2();
}}