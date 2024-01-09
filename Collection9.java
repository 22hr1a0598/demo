import java.util.ArrayList;
class A
{
public static void main(String args[]){
ArrayList<String>animal=new ArrayList<>();
//add ele in array
animal.add("d0g");
animal.add("fox");
animal.add("goat");
animal.add("horse");
System.out.println("ArrayList:"+animal);
//iterate using for each loop
System.out.println("access individual list:"+animal);
for(String temp:animal){
System.out.print(temp);
System.out.print(",");
}}}