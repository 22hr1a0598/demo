interface Bank{
float RateOfInterest();
}
class SBI implements Bank{
public float RateOfInterest(){
return 8.56f;
}
}
class PNB implements Bank{
public float RateOfInterest(){
return 8.67f;
}
}
class TestBank{
public static void main(String args[]){
Bank b=new SBI();
System.out.println("rate of interest is:"+b.RateOfInterest());
}}