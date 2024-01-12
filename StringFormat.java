//format()
public class StringFormat{
public static void main(String args[]){
String s1=new String("hello ");
String s2=new String("python ");
String s3=new String("world");
String s=String.format("%s%s%s",s1,s2,s3);
System.out.println(s.toString());
}}