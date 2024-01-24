class Vowels{
public static void main(String[] args) {
String str = "Today is last day";
str = str.toLowerCase(); 
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
System.out.print(ch + " ");}
}}}