import java.util.*;
class CharAt1{
ArrayList<Character>al;
//constructor creating and assigning values to ArrayList al
CharAt1(){
al=new ArrayList<Character>();
al.add('A');
al.add('E');
al.add('I');
al.add('O');
al.add('U');
al.add('a');
al.add('e');
al.add('i');
al.add('o');
al.add('u');}
//a method that checks whether the character c is a vowel or not
private boolean isVowel(char c)
{
for(int i=0;i<al.size();i++)
{
if(c==al.get(i))
{
return true;
}
}
return false;
}
public int countVowel(String s)
//method to calculate vowels in String s
{
int countVowel=0;//Store total no.of vowels
int size=s.length();
//size of string
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isVowel(c))
{
countVowel=countVowel+1;
//vowel found!increase the count by 1
}}
return countVowel;
}
public static void main(String args[]){
//creating an obj of cls charAt1
CharAt1 obj=new CharAt1();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfVowel=obj.countVowel(str);
System.out.println("string:"+str);
System.out.println("total no of vowels in the string are:"+noOfVowel+"\n");
}}