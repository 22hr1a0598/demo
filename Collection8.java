import java.util.ArrayList;
class A
{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
//add ele in array
languages.add("d");
languages.add("f");
languages.add("g");
languages.add("h");
System.out.println("ArrayList:"+languages);
//change the elements of arraylist
languages.set(2,"kotlin");
System.out.println("modified list:"+languages);
}}