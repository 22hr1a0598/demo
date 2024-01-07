//static variable(initialized nly once) is called as call variable
//to demonstrate use of static variable
class Student{
int rollno;
String name;
static String college="mtie";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name" "+college);
}}
