import java.util.Scanner;

class student implements Cloneable{
private String name;
private int age;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
@Override
protected Object clone() throws CloneNotSupportedException {
    
    return super.clone();
}


}
class Main{
 public static void main(String[] args) throws CloneNotSupportedException{
     Scanner sc=new Scanner(System.in);
     String name=sc.next();
     int age=sc.nextInt();
     student std= new student();
     std.setAge(age);
     std.setName(name);
     System.out.println(std.getName() +" "+ std.getAge());
     student std1=(student)std.clone();
     System.out.println(std1.getName() +" "+ std1.getAge());
     std1.setAge(33);
 }

}
