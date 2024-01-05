import java.io.*;
import java.util.*;
class Test{
static public void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test.printmonth(inpVar));
}
public static String printmonth(int monthno){
String month;
switch(monthno){
case 0:{month="JANUARY";break;}
case 1:{month="FEBRUARY";break;}
case 2:{month="MARCH";break;}
case 3:{month="APRIL";break;}
case 4:{month="MAY";break;}
case 5:{month="JUNE";break;}
case 6:{month="JULY";break;}
case 7:{month="AUGUST";break;}
case 8:{month="SEPTEMBER";break;}
case 9:{month="OCTOBER";break;}
case 10:{month="NOVEMBER";break;}
case 11:{month="DECEMBER";break;}

default:month="INVALID";
}
return month;

}
}