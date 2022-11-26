package lib;
import java.util.*;
public class whileloop {
   public static void main(String args[]){
    //int counter=0;
    /*while(counter<100000){
        System.out.println("hello world");
        counter++;
    }
    System.out.println("finish");*/
    /*  Scanner sc = new Scanner(System.in);
      int range = sc.nextInt();
      int counter=1;
      while(counter<=range){
        System.out.print(counter + " ");
        counter++;
      }*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum is: " +sum);
   }
}