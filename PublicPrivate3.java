import java.util.*;
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
Scanner sc=new Scanner(System.in);

Student o[]=new Student[3];
for(int i=0;i<3;i++){
o[i]=new Student();
o[i].setId(sc.nextInt());
o[i].setName(sc.next());}
System.out.println("details are:\n");
for(int j=0;j<3;j++){
System.out.println("id:"+o[j].getId());
System.out.println("Name:"+o[j].getName());
}
}
}