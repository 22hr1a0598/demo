//copying values withoutconstructor
class Student{
int id;
String name;
//constructor to initialize integer and string
Student(int i,String n)
{
id=i;
name=n;
}
//constructor to initializeanother object
Student(){}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[]){
Student s1=new Student(555,"pallu");
Student s2=new Student();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();

}}