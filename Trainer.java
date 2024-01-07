import java.util.Scanner;
class Trainer{
private int tid;
public void setTid(int tid){this.tid=tid;}
public int getTid(){return this.tid;}
public Trainer(int tid){this.tid=tid;}
public Trainer()
{this.tid=0;}
}
class Test{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter id:");
int tidin=sc.nextInt();
Trainer t=new Trainer(tidin);
System.out.println("tid:"+t.getTid());
}}