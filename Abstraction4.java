abstract class S{
abstract void draw();}
class R extends S{
void draw(){System.out.println("draw rect");
}
}
class C extends S{
void draw()
{
System.out.println("draw circle");
}}
class TAbstraction{
public static void main(String args[]){
S s=new C();
s.draw();
R r=new R();
r.draw();
}}