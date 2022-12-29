// import java.util.Scanner;

public class makeAnArray {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,3,3,4,4,4};
        int count = 0;
        for(int i = 1; i<arr.length ; i++){
            if(arr[i]!=arr[count]){
                count++;
                arr[count] =arr[i];
            }
        }
      System.out.println(count+1);
    }
}
