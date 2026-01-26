// factorial using command line argument

public class Factorial {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int fact=1;
        System.out.println(" FACTORIAL OF A NUMBER ");
        for(int i=1; i<=n; i++){
            fact *= i; 
        }
        System.out.println("The Factorial is:"+fact);
    }
}