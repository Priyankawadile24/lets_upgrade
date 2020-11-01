import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5], sum = 0;
        
        for(int i=0; i<5; i++){
            System.out.print("Enter element of "+i+" index : ");
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<5; i++){
            sum = sum+arr[i];
        }

        System.out.println("Sum of the array values : "+sum);
    }
}