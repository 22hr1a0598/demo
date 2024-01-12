import java.util.*;
class Dig{
ArrayList<Character>al;
//constructor creating and assigning values to ArrayList al
Dig(){
al=new ArrayList<Character>();
al.add('0');
al.add('1');
al.add('2');
al.add('3');
al.add('4');
al.add('5');
al.add('6');
al.add('7');
al.add('8');
al.add('9');}
//a method that checks whether the character c is a vowel or not
private boolean isNum(int a)
{
for(int i=0;i<al.size();i++)
{
if(a==al.get(i))
{
return true;
}
}
return false;
}
public int countNum(String s)
//method to calculate vowels in String s
{
int countNum=0;//Store total no.of vowels
int size=s.length();
//size of string
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isNum(c))
{
countNum=countNum+1;
//vowel found!increase the count by 1
}}
return countNum;
}
public static void main(String args[]){
//creating an obj of cls charAt1
Dig obj=new Dig();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfNum=obj.countNum(str);
System.out.println("string:"+str);
System.out.println("total no of dig in the string are:"+noOfNum+"\n");
}}