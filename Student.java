import java.util.*;

public class Student {
    int ID;
    String name;
    String address;
    int marks;

    void setData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID, Name, address, marks");
        ID= input.nextInt();
        name= input.next();
        address= input.next();
        marks= input.nextInt();
    }

    void getData(){
        System.out.println("Name: "+ name );
        System.out.println("ID: "+ ID);
        System.out.println("address" + address);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
        System.out.println("Hello, Student!");
        Student std = new Student();
        std.setData();   
        std.getData();     

    }
}
