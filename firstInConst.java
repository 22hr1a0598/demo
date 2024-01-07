class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
//constructor to initializeanother object
Student(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis{
public static void main(String args[]){
Student s1=new Student(555,"pallu","cse");
Student s2=new Student(598,"pallavi","aids",500f);
s1.display();
s2.display();

}}