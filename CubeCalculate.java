//calling static method by class
class Calculator{
static int cube(int x){
return x*x*x;
}
public static void main(String args[]){
int result=Calculator.cube(2);
System.out.println(result);
}}