//heirachichal
class Animal{
void eat()
{
System.out.println("eating....");
}
}
class Dog extends Animal{
void bark()
{
System.out.println("barking...");}
}
class Cat extends Animal{
void meow(){System.out.println("meowing......");
}
}
class TestInheritance{
public static void main(String args[]){
Cat bc=new Cat();
bc.eat();
bc.meow();
Dog d=new Dog();
d.bark();}}