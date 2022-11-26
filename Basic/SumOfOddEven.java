import java.util.*;
public class SumOfOddEven {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int choice;
        int evenSum=0;
        int oddSum=0;
        
        do{
            System.out.print("Enter the no :");
            int number = sc.nextInt();
            if(number%2==0){
                evenSum=evenSum + number;
            }else{
                oddSum =oddSum + number;
            }
            System.out.println("do you want to continue? Press 1 for yes or 0 for no");
            choice=sc.nextInt();
        }
        while(choice==1);
        System.out.println("sum of even "+evenSum);
        System.out.println("sum of odd "+oddSum);
        
    }
}
