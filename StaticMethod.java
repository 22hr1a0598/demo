//java Static method
//belong to rather than a objclas
//can access var and can change var
class Student{
int rollno;
String name;
static String college="mtie";
static void change(){
college="Reddy";
}
Student(int r,String n){
rollno=r;
name=n;}
void display(){
System.out.println(rollno+" "+name+" "+college);
}}
//test cls to create and display values of obj
public class  TestStaticMethod{
public static void main(String args[]){
//create obj
Student s1=new Student(555,"ppp");
Student s2=new Student(222,"sss");
student.change();
Student s1=new Student(333."ccc");
s1.display();
s2.display();
s3.display();
}}