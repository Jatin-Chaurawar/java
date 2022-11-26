import java.util.*;
public class Posorneg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number A:");
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("no is positive");
        }
        else if(a == 0){
            System.out.println("number is null");
        }
        else{
            System.out.println("no is negative");
        }
    }
}
