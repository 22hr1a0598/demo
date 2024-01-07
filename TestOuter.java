//nested class with static method
public class TestOuter{
static int data=30;
static class Inner{
static void msg(){
System.out.println("data is"+data);
}}
public static void main(String args[]){
TestOuter.Inner.msg();

}}