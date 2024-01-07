class Bike{
final void run(){
System.out.println("running");
}}
class Honda extends Bike{
void run(){
System.out.println("running safely with 100kmp");}

public static void main(String args[])
{
Honda ob=new Honda();
ob.run();}}
