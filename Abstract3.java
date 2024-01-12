//abstract parenrt class
abstract class B
{
//abstract method 
abstract void run();
}
//dog class extends/inherits animal class
class H extends B
{
public void run(){
System.out.println("running safely");
}}
class T{
public static void main(String args[])
{B ob=new H();
ob.run();}}