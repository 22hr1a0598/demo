import java.util.Scanner;
class Test1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=n;
do{
System.out.print(i+",");
i=i-5;
}
while(i>=0);
}}