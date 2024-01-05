import java.util.Scanner;
class Conti{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();//50
byte i=0;
//short i=0;
while(true){
i++;
if(i%5==0)continue;
System.out.print(i+",");
else{System.out.println(i+",");
}}}