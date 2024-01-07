//pass arg in method
class S
{
void m(S obj){
System.out.println("method is invocked");
}
void p(){
m(this);//m(ob);
}
public static void main(String args[]){
S ob=new S();
ob.p();
}
}