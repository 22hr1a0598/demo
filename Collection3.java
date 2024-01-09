import java.util.List;
import java.util.ArrayList;
class A{
public static void main(String args[]){
//Creating list using the arraylist class
List<Integer>numbers=new ArrayList<>();
numbers.add(11);//add elements to List
numbers.add(22);
numbers.add(33);
System.out.println("list:"+numbers);
int number=numbers.get(2);//access elemnets from list
System.out.println("accessed ele:"+number);
int removedNumber=numbers.remove(1);
//remove element from list
System.out.println("removed ele:"+removedNumber);
System.out.println("List:"+numbers);
}}