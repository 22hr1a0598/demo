//java program to illustrate the use of static variable which is shared with obj
class Count{
static int count=0;//will get memory only once and retain its value 
Count(){
count++;
System.out.println(count);
}
public static void main(String args[]){
//creating objects
Count c1=new Count();
Count c2=new Count();
Count c3=new Count();
}}