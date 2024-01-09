import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
//creating list using theLinked Listclass
List<String>alpha=new ArrayList<>();
//add elements to list
alpha.add("A");
alpha.add("S");
alpha.add("D");
alpha.add("F");
alpha.add("G");
alpha.add("H");
alpha.add("J");
alpha.add("K");
alpha.add("L");
alpha.add("P");

System.out.println("List:"+alpha);
//access element list
String alphabet=alpha.get(4);
System.out.println("accessed ele:"+alpha);
//using the indexOf()method
String index=alpha.indexOf("P");
System.out.println("position of P is" +index);
//remove element from the list
String removedAlphabet=alpha.remove(3);

System.out.println("removed els:"+removedAlphabet);
}}