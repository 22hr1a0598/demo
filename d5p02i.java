import java.util.Scanner;
class InputMonthNumber1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int mn;
mn=sc.nextInt();
if(mn==0){System.out.print("JANUARY");}
else if(mn==1){System.out.print("FEBRUARY");}
else if(mn==2){System.out.print("MARCH");}
else if(mn==3){System.out.print("APRIL");}
else if(mn==4){System.out.print("MAY");}
else if(mn==5){System.out.print("JUNE");}
else if(mn==6){System.out.print("JULY");}
else if(mn==7){System.out.print("AUGUST");}
else if(mn==8){System.out.print("SEPT");}
else if(mn==9){System.out.print("OCT");}
else if(mn==10){System.out.print("NOV");}
else if(mn==11){System.out.print("DEC");}

else{System.out.println("INVALID");}


}
}