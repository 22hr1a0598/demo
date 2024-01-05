class A{
public void funA1(){
System.out.println("funa1 called from clas A");
}
public void funA2(){
System.out.println("funa2 called from clas A");
}
}
class B
{
public static void main(String args[]){
A ob=new A();
ob.funA1();
ob.funA2();
}
}
