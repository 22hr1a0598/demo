import java.util.*;
class Digit{
private boolean isDigit(char ch){
if(ch=='0'|| ch=='1'|| ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
return true;
else
return false;
}
//to count total number of digits from 0to n
public int countDigit(String str){
int count=0;
for(int i=0;i<str.length();i++)
if(isDigit(str.charAt(i)))
count++;
return count;
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
Digit ob=new Digit();
System.out.println("Total number of digits= ");
System.out.println(ob.countDigit(str));
}
}