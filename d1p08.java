class A{
public static void funA1(){
System.out.println("funa1 called from clas A");
}
public static void funA2(){
System.out.println("funa2 called from clas A");
}
}
class B
{
public static void main(String args[]){
A.funA1();
A.funA2();
}
}