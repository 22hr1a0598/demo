import java.util.Scanner;
class Trainer{
private int tid;
private String tname;
public void setTid(int tid)
{this.tid=tid;}
public void setTname(String tname)
{this.tname=tname;}
public int getTid()
{return this.tid;}
public String getTname()
{return this.tname;}
public Trainer(int tid)
{this.tid=tid;}
public Trainer(String tname)
{this.tname=tname;}
public Trainer()
{this.tid=0;
this.tname="Null";}
}
class Test3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
for(int i=0;i<=5;i++){
System.out.println("enter teacher id");
System.out.println("enter teacher name");
int tidin=sc.nextInt();
String tnamein=sc.next();
Trainer ob1=new Trainer(tidin);
Trainer ob2=new Trainer(tnamein);
System.out.println("tid:"+ob1.getTid());
System.out.println("tname:"+ob2.getTname());
}
}}