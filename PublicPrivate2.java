class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}

public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day{
public static void main(String args[]){
Student o[]=new Student[3];
o[0]=new Student();
o[0].setId(3333);
o[0].setName("ppp");
System.out.println("id:"+o[0].getId());
System.out.println("name:"+o[0].getName());
o[1]=new Student();
o[1].setId(358);
o[1].setName("sss");
System.out.println("id:"+o[1].getId());
System.out.println("name:"+o[1].getName());
o[2]=new Student();
o[2].setId(333);
o[2].setName("ccc");
System.out.println("id:"+o[2].getId());
System.out.println("name:"+o[2].getName());
}
}