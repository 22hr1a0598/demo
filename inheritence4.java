/* 
if the same method is present in both the suoerclass and sub class the method in the subclass overrides the method in thw super class.
this concept is known as method overriding 
Redefining method of base class in derived class is method overriding.ex:method overriding in inheritance 
*/
class Animal{
//method in super class
public void eat()
{
System.out.println("i can eat..");}
}
//dog inherits animal
class Dog extends Animal{
//overriding the eat() method
//@override
public void eat(){
System.out.println("i eat dog food..");}
//new method in subclass
public void bark()
{
System.out.println("i can bark...");}
}
class Test{
public static void main(String args[]){
Dog labrador=new Dog();//creating an obj of subclass
//call the eat()
labrador.eat();
labrador.bark();
}}