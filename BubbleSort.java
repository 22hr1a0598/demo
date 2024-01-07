import java.util.Scanner;
class Search_Element
{
public static void main(String args[])
{
int n,i=0,j=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements:");

n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();}
// code for array sorting
for(i=0;i<a.length;i++){
for(j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]>a[j]){
//swapa[i]anda[j]
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}//for innerloop
}//forouter loop
//display array
for(int x : a)
System.out.print(x+" ");
}
}