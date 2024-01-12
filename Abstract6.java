abstract class Bank{
abstract float getRateOfInterest();
}
class SBI extends Bank{
float getRateOfInterest(){
return 8;
}
}
class PNB extends Bank{
float getRateOfInterest(){
return 5;
}
}
class PLV extends Bank{
float getRateOfInterest(){
return 7;
}
}
class ICICI extends Bank{
float getRateOfInterest(){
return 8;
}
}
class Axis extends Bank{
float getRateOfInterest(){
return 7;
}
}


class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");
b=new PLV();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");

b=new ICICI();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");

b=new Axis();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");
}}