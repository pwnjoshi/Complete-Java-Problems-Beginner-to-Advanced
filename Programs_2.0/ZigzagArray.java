import java.util.Scanner;

public class ZigzagArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }

        boolean flag = true;     

        for (int i = 0; i < size - 1; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag;
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        } 
        input.close();
    }
    
}
