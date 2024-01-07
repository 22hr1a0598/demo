//Sum averageof an array elements
class Main{
public static void main(String args[])
{
int a[]={2,4,3,-2,2};
int sum=0;
Double avg;
for(int number:a){
sum+=number;
}
int arrayLength=a.length;
avg=((double)sum/(double)arrayLength);
System.out.println("Sum="+sum);
System.out.println("Average="+avg);
}
}