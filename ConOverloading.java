//parameterized constructor overloading
class Student{
int id;
String name;
int age;
//creating 2arg  constructor
Student(int i,String n)
{
id=i;
name=n;
age=0;
}
//craeting3 args constructor
Student(int i,String n,int a){
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[]){
Student s1=new Student(555,"pallu",12);
Student s2=new Student(598,"pallavi",18);
s1.display();
s2.display();
}}