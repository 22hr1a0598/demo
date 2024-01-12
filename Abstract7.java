
//Example of abstract class that has abstract and non-abstract methods
abstract class Bike{
Bike(){System.out.println("Bike is created:");}
abstract void run();
void changegear(){System.out.println("gear changed");}
}
//creating a child which inherits Abstrac class
class Honda extends Bike{
void run(){System.out.println("running safely..");}
}
//creating a test class which calls abstract and non-//abstract methods
class Test{
public static void main(String args[]){
Bike obj=new Honda();
obj.run();
obj.changegear();
}
}