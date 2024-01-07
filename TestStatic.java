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
System.out.println(rollno+" "+name+" "+college);
}}
public  class TestStatic{
public static void main(String[] args){
Student s1=new Student(555,"ppp");
Student s2=new Student(598,"sss");
Student.college="Reddy";
s1.display();
s2.display();
}}