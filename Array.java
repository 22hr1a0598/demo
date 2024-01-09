//passing class Array to a method as parameter
import java.util.Scanner;
class ArrayToMethod 
{
public int max(int array[])
{
int max=0;
for(int i=0;i<array.length;i++)
{
if(array[i]>max)
{
max=array[i];
}
}//for
return max;
}//max
public int min(int array[])
{
int min=array[0];
for(int i=0;i<array.length;i++)
{
if(array[i]<min)
{
min=array[i];
}
}//for
return min;
}//min()
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array that is to created:");
int size=sc.nextInt();
int myArray[]=new int[size];
System.out.println("enter elements of array:");
for(int i=0;i<size;i++)
{
myArray[i]=sc.nextInt();
}
ArrayToMethod m=new ArrayToMethod();
System.out.println("max value in array is:"+m.max(myArray));
System.out.println("min value in array is:"+m.min(myArray));
}
}

