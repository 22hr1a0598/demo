//capacity
class StringBuilderEx6{
public static void main(String args[]){
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());//default 16
sb.append("hello");
System.out.println(sb.capacity());//now 16
sb.append("java is my fav language");
System.out.println(sb.capacity());//now(16*2)+2=34 i.e(old capacity*2)+2
}}
