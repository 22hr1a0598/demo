interface Drawable{
void draw();
}
class Rectangle implements Drawable{
public void draw(){
System.out.println("draw rect");
}
}
class Circle implements Drawable{
public void draw()
{
System.out.println("draw circle");
}}
class Test{
public static void main(String args[]){
Drawable d=new Circle();
d.draw();
}}