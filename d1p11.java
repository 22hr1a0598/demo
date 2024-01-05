import java.util.Scanner;
class test{
public static void checkEvenOdd(int a){
if((a/2)*2==a)
System.out.println("EVEN");
else
System.out.println("ODD");
}

public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
test.checkEvenOdd(n);
}
}
