class Student{
private  int id;
private String name;}
class Test{
public static void main(String args[]){
Student ob=new Student();
System.out.println(ob.id+" "+ob.name);
ob.id=2345;
ob.name="pallu";
System.out.println(ob.id+" "+ob.name);
}}