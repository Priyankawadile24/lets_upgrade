public class Main {
    public static void main(String[] args){
    int arr[] = new int[5];
    arr[0] = 26; 
    arr[1] = 37; 
    arr[2] = 41; 
    arr[3] = 54; 
    arr[4] = 25;
    System.out.print("Odd Values : ");
    for(int i=0; i<5; i++){
        if(arr[i]%2!=0){
            System.out.print(arr[i]+" ");
        }
    }
}
}