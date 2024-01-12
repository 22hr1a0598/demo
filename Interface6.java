interface Draw{
void draw();
default void msg()
{
System.out.println("default method");}
}
class Rect implements Draw{
public void draw()
{
System.out.println("drawing rect");
}
}
class TestInterfaceDefault{
public static void main(String args[]){
Draw d=new Rect();
d.draw();
d.msg();
}}