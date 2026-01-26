import java.util.Scanner;

public class Reverse {
    int rev(int num){
        int sum=0;
        while(num!=0){
            int r=num%10;
            sum = sum*10+r;
            num = num/10;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int num;
        System.out.println("REVERSE OF A NUMBER USING FACTORIAL");
        System.out.println("\nEnter the number");
        try (Scanner input = new Scanner(System.in)) {
            num = input.nextInt();
        }
        Reverse obj=new Reverse();
        int res=obj.rev(num);
        System.out.println("The reverse of a number is:" + res );
    }
}
