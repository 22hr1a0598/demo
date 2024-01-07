class B{
final void run(){
System.out.println("running.....");
}
}
class H extends B{
public static void main(String args[]){
new H().run();
}
}