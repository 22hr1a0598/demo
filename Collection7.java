import java.util.LinkedList;
class A
{
public static void main(String args[]){
LinkedList<Integer>num=new LinkedList<>();
//add ele in array
num.add(4);
num.add(5);
num.add(6);
num.add(7);
System.out.println("linkedList:"+num);
//change the elements of arraylist
num.set(2,67);
System.out.println("modified list:"+num);
}}