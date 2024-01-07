//super will be automatically give super if we dont give super()
class Animal{
Animal(){System.out.println("animal created");
}
}
class Dog extends Animal{
Dog(){
super();
System.out.println("dog is created");

}
}class Test{
public static void main(String args[]){
Dog d=new Dog();
}}