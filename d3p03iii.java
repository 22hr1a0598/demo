class Book{
private String name;
private int roll_no;
private String branch;
private String sec;
private String subject;
public void setName(String name){this.name=name;}
public void setRoll_no(int roll_no){this.roll_no=roll_no;}
public void setBranch(String branch){this.branch=branch;}
public void setSec(String sec){this.sec=sec;}
public void setSubject(String subject){this.subject=subject;}
public String getName(){return name;}
public int getRoll_no(){return roll_no;}
public String getBranch(){return branch;}
public String getSec(){return sec;}
public String getSubject(){return subject;}}
class BCA{
public static void main(String args[])
{
Book ob=new Book();
ob.setName("pallavi");
ob.setRoll_no(23456);
ob.setBranch("cse");
ob.setSec("B");
ob.setSubject("JAVA");
System.out.println("name:"+ob.getName());
System.out.println("roll_no:"+ob.getRoll_no());
System.out.println("branch:"+ob.getBranch());
System.out.println("sec:"+ob.getSec());
System.out.println("subject:"+ob.getSubject());}}
