import java.util.Scanner;
public class RelationalOperators1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st number:");
int num1=sc.nextInt();
System.out.println("enter 2nd number:");
int num2=sc.nextInt();
System.out.println("enter 3rd number:");
int num3=sc.nextInt();
//int num1=1; int num2=2;
System.out.println("num1>num2>num3 is"+(num1>num2>num3));
System.out.println("num1<num2<num3 is"+(num1<num2<num3));
System.out.println("num1>=num2>=num3 is"+(num1>=num2>=num3));
System.out.println("num1<=num2<=num3 is"+(num1<=num2<=num3));
System.out.println("num1!=num2!=num3 is"+(num1!=num2!=num3));

}
}