// variable through reference//
class BSC{
public int x;
public void setX(int a){x=a;}
}
class BCA{
public static void main(String args[])
{
System.out.println("good morning");
BSC ob=new BSC();
ob.setX(10);
System.out.println("X:"+ob.x);
}}
//setter-initialize value to instance variable.....getter-retrive data from instance variable//