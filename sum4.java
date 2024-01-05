class Test{
public static void main(String args[]){
int i;
int sum=0;

for(i=0;i<=100;i+=5)
{System.out.print(i+"+");
sum=sum+i;

}
System.out.print("\b"+"="+sum);
}}

//   \b=backspace