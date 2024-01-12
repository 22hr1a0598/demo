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
}}
class Lion extends Animal
{
public void sound(){
System.out.println("roars");
}}
class Cat extends Animal
{
public void sound(){
System.out.println("meow");
}}
class Test{
public static void main(String args[])
{Animal ob;
ob=new Dog();
ob.sound();
ob=new Lion();
ob.sound();
ob=new Cat();
ob.sound();
}}