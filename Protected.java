class P{
protected String fname="John";
protected String Iname="Doe";
protected int age=24;
}
class S extends P{
private int graduationYear=2018;
public static void main(String args[]){
S myObj=new S();
System.out.println("Name:"+myObj.fname+""+myObj.Iname);
System.out.println("age:"+myObj.age);
System.out.println("Graduation Year:"+myObj.graduationYear);
}}