abstract class Bank{
abstract int getRateOfInterest();
}
class SBI extends Bank{
int getRateOfInterest(){
return 8;
}
}
class PNB extends Bank{
int getRateOfInterest(){
return 8;
}
}
class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");}}