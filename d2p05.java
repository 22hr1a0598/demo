import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))||(c!='a'||c!='e'||c!='i'||c!='o'||c!='u'||c!='A'||c!='E'||c!='I'||c!='0'||c!='U');
System.out.println("consonant");
else
System.out.println("vowel");

}
}