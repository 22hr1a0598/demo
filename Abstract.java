//abstract parenrt class
abstract class Animal
{
//abstract method 
public abstract void sound();
}
//dog class extends/inherits animal class
class Dog extends Animal
{
public void sound(){
System.out.println("woof");
}
public static void main(String args[])
{Animal ob=new Dog();
ob.sound();}}