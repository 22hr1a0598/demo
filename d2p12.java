class Square{
int side;
int perimeter;
void insert(int s){
side=s;
perimeter=s;
}
void calculateArea()
{
System.out.println(side*side);
System.out.println(4*side);
}
}
class TestSquare{
public static void main(String args[]){
Square s1=new Square();
s1.insert(2);
s1.calculateArea();
}}