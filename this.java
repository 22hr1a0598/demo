//use this in instancekeyword
//this:to refer current class instanvcce variable
class Student{
int id;
String name;
float fee;
//constructor to initialize integer and string
Student(int id,String name,float fee)
{
this.id=id;
this.name=name;
this.fee=fee;
}
//constructor to initializeanother object
void display()
{
System.out.println(id+" "+name+" "+fee);
}
}
class TestThis{
public static void main(String args[]){
Student s1=new Student(555,"pallu",200f);
Student s2=new Student(598,"pallavi",500f);
s1.display();
s2.display();

}}