interface printable{

void print();}
class A implements printable{
public void print()
{
System.out.println("hlo");}
}
class Test{
public static void main(String args[]){
A o=new A();
o.print();}}
