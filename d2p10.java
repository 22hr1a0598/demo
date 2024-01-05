class Employee{
int id;
String name;
String department;
void insertRecord(int i,String n,String d){
id=i;
name=n;
department=d;
}
void displayInformation()
{
System.out.println(id+" "+name+" "+department);}
}
class TestEmployee1{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(598,"pallu","cse");
e2.insertRecord(590,"pallavi","aids");
e3.insertRecord(591,"pallavi","ds");
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}
