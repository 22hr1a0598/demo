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
System.out.println("List:"+numbers);
//access element list
int number=numbers.get(2);
System.out.println("accessed ele:"+numbers);
//using the indexOf()method
int index=numbers.indexOf(20);
System.out.println("position of 20"+index);
//remove element from the list
int removedNumber=numbers.remove(1);
System.out.println("removed els:"+removedNumber);
}
}