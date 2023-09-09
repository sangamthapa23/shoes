import  java.io.*;
public class Local_variable{
 String name;
 int age;
 String address;


 public Local_variable(String name, int age, String address){

  this.name = name;
  this.age = age;
  this.address = address;


 }



 public static void main(String[] args){

  Local_variable lv = new Local_variable("Sangam", 12, "MHOW");
System.out.println(lv.address);
  System.out.println(lv.age);
  System.out.println(lv.name);

 }
}
