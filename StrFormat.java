//join()
public class StrFormat{
public static void main(String args[]){
String s1=new String("hello ");
String s2=new String("python ");
String s3=new String("world");
String s=String.join("#",s1,s2,s3);
System.out.println(s.toString());
}}