import java.util.Scanner;

public class Swap{

     void swap(int a,int b){
        int c;
        c=a;
        a=b;
        b=c;
        
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number a and b");
        int a=input.nextInt();
        int b=input.nextInt();
        Swap obj = new Swap();
        obj.swap(a, b);
 // why can we call static method without method creation 
    }
}