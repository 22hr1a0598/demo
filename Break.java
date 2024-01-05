import java.util.Scanner;
class Break{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();//50
byte i=0;
//short i=0;
while(true){
System.out.print(i+",");
if(i==n)break;
i++;
}
}}