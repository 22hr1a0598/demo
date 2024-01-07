import java.util.Scanner;
class Trainer{
private int tid;
private String tname;
private String tcourse;
public void setTid(int tid)
{this.tid=tid;}
public void setTname(String tname)
{this.tname=tname;}
public void setTcourse(String tcourse)
{this.tcourse=tcourse;}
public int getTid()
{return this.tid;}
public String getTname()
{return this.tname;}
public String getTcourse()
{return this.tcourse;}
public Trainer(int tid,String tname)
{this.tid=tid;
this.tname=tname;}
public Trainer(String tcourse)
{this.tcourse=tcourse;}
public Trainer()
{this.tid=0;
this.tname=null;
this.tcourse=null;}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
for(int i=0;i<=2;i++){
Trainer ob[i]=new Trainer(sc.nextInt();sc.next());
// or we can use the below 3 lines
//Trainer ob[i]=new Trainer();
//ob[i].setTid(sc.nextInt());
//ob[i].setTname(sc.next);   
System.out.println("enter teacher id");
System.out.println("enter teacher name");
System.out.println("enter teacher course");
int tidin=sc.nextInt();
String tnamein=sc.next();
String tcoursein=sc.next();
Trainer ob1=new Trainer(tidin);
Trainer ob2=new Trainer(tnamein);
Trainer ob3=new Trainer(tcoursein);
System.out.println("tid:"+ob1.getTid());
System.out.println("tname:"+ob2.getTname());
System.out.println("tcourse:"+ob3.getTcourse());
}
}}