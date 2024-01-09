import java.util.List;
import java.util.LinkedList;
class Main{
public static void main(String args[]){
//creating list using theLinked Listclass
List<Integer>numbers=new LinkedList<>();
//add elements to list
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
numbers.add(60);
numbers.add(70);
numbers.add(80);
numbers.add(90);
numbers.add(100);

System.out.println("List:"+numbers);
//access element list
int number=numbers.get(4);
System.out.println("accessed ele:"+numbers);
//using the indexOf()method
int index=numbers.indexOf(50);
System.out.println("position of 50" +index);
//remove element from the list
int removedNumber=numbers.remove(3);

System.out.println("removed els:"+removedNumber);
}}