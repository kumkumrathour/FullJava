import java.util.Scanner;
public class gameForm {
    public static void main(String[] args){
        int R = (int)(Math.random()*10+1);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = 1;
        while(N !=R){
            C++;
            if(N<R){
                System.out.println(N + " is Smaller ");
                N = sc.nextInt();


                
            }
                else{
                System.out.println(N+" is greater");
                System.out.println(" enter another number ");
                N = sc.nextInt();
                }
        }
        if(C==1){
            System.out.println(" *****\n congratulation ..");
        }
          else if(C==2){
               System.out.println(" ***\n congratulation ..");
           }
           else{
            System.out.println("cong");
           }
           
        
    }
}
