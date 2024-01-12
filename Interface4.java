interface Printable{
void print();
}
interface Showable{
void show();}
class A implements Printable,Showable{
public void print(){System.out.println("hlo");}
public void show(){System.out.println("welcome");}
}
class Test{
public static void main(String args[]){
A ob=new A();
ob.print();
ob.show();}} 