public class PrePostDecre
{
public static void main(String args[])
{
int i=20;
int a=i--;
System.out.println("a="+a); //20
System.out.println("i="+i); //19
--i;
System.out.println(i); //18
System.out.println(--i); //17
System.out.println(i--); //17
System.out.println(i); //16
int j=20;
int b=--j;
System.out.println("b="+b);//19
System.out.println("j="+j);//19



}
}