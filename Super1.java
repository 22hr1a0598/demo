//calling immediate base class method,var,and constructor we use super keyword
class A{
void eat()
{
System.out.println("starving");
}
}
class Animal extends A{
void eat(){
System.out.println("eating....");
}
}
class Dog extends Animal{
void eat()
{
System.out.println("eating bread");
}
void bark()

{
System.out.println("barking....");
}
void work(){
super.eat();
bark();
}
}
class Test{
public static void main(String args[]){
Dog d=new Dog();
d.work();
}
}