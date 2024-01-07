class Author{
String authorName;
int age;
String place;
//Author class Constructor
Author(String name,int age,String place){
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author author;//author details
Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String args[]){
Author author=new Author("SSS",45,"RR");
Book b=new Book("java Beginners",800,author);
System.out.println("Book name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println("---------------Author details----------");
System.out.println("Author name:"+b.author.authorName);
System.out.println("Author age:"+b.author.age);
System.out.println("Author place:"+b.author.place);
}
}








