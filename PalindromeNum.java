import java.util.Scanner;
class PalindromeNum
{  
 public static void main(String args[])
{  
  Scanner sc=new Scanner(System.in);
String n;
String rn="";
System.out.println("enter num");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rn=rn+n.charAt(i);
}
if(n.equals(rn))
{    
   System.out.println("palindrome number ");}    
  else    
{  System.out.println("not palindrome");    }
}  
} 