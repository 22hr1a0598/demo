//single inheritance
class Emp
{
float salary=40000;
}
class Prog extends Emp
{
int bonus=10000;
public static void main(String args[])
{
Prog p=new Prog();
System.out.println("Prog salary is:"+p.salary);
System.out.println("bonus of prog is:"+p.bonus);
}}