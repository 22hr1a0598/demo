//only in constructor we can initialize blank final var
class B{
final int speedlimit;//blank final var
B(){
speedlimit=70;
System.out.println(speedlimit);
}
public static void main(String args[]){
new B();
}}