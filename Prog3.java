import java.util.Scanner;
class Prog{
public static void main(String args[]){
int[] num={11,22,33,44,55};
try {
for(int i=0;i<=5;i++)
{System.out.println(num[i]);
}}
catch(ArithmeticException e){
System.out.println(e+"one 1");}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e+"two 2");}
catch(Exception ob){
System.out.println(ob+"three 3");}
System.out.println("thank u");}}