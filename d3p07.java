import java.io.*;
class BufferedReaderExample{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("enter name");
String name=br.readLine();
System.out.println("welcome"+name);
}}