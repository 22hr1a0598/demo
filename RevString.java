import java.util.Scanner;
class RevString{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n; 		//to hold string
String rs=""; 		//to hols revstring
//Sop(enetr string
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
}
}