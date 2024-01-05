class Icard{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private int aadhar_no;
public void setCollege_name(String college_name){this.college_name=college_name;}
public void setCollege_address(String college_address){this.college_address=college_address;}
public void setAy_start(int ay_start){this.ay_start=ay_start;}
public void setAy_end(int ay_end){this.ay_end=ay_end;}
public void setId(int id){this.id=id;}
public void setStudent_name(String student_name){this.student_name=student_name;}
public void setCourse_name(String course_name){this.course_name=course_name;}
public void setAadhar_no(int aadhar_no){this.aadhar_no=aadhar_no;}
public String getCollege_name(){return college_name;}
public String getCollege_address(){return college_address;}
public int getAy_start(){return ay_start;}
public int getAy_end(){return ay_end;}
public int getId(){return id;}
public String getStudent_name(){return student_name;}
public String getCourse_name(){return course_name;}
public int getAadhar_no(){return aadhar_no;}}
class BCA1{
public static void main(String args[])
{
Icard ob=new Icard();
ob.setCollege_name("MTIET");
ob.setCollege_address("MELUMOI");
ob.setAy_start(2022);
ob.setAy_end(2026);
ob.setId(23456);
ob.setStudent_name("pallavi");
ob.setCourse_name("CSE");
ob.setAadhar_no(3456789);
System.out.println("college_name:"+ob.getCollege_name());
System.out.println("college_address:"+ob.getCollege_address());
System.out.println("ay_start:"+ob.getAy_start());
System.out.println("ay_end:"+ob.getAy_end());
System.out.println("id:"+ob.getId());
System.out.println("student_name:"+ob.getStudent_name());
System.out.println("course_name:"+ob.getCourse_name());
System.out.println("aadhar_no:"+ob.getAadhar_no());}}
