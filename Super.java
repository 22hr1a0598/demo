//super is used to refer immediate parent class instance variable
class Animal{
String color="white";
}
class Dog extends Animal{
String color="black";
void printColor(){
System.out.println(color);//prints color of dog class
System.out.println(super.color);//print color of animal class
}}
class TestSuper1{
public static void main(String args[]){
Dog d=new Dog();
d.printColor();}}