//== we compare reference not values
//= compare value
class Test{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin";
String s3=new String("String");
System.out.println(s1==s2);//false(because s3 refers to same instance)
System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool
}}