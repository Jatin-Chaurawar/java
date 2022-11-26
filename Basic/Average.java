import java.util.*;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();        
        int b = sc.nextInt();        
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println(a);       
        System.out.println(b);       
        System.out.println(c);      
        System.out.print(avg); */
        /*int s = sc.nextInt();
        int area = s * s;
        System.out.println("Area :"+area); */
        float p1 = sc.nextFloat();   
        float p2 = sc.nextFloat();   
        float e = sc.nextFloat();
        float bill = p1 + p2 + e;
        System.out.println(bill); 
        float newbill = bill + (0.18f * bill);
        System.out.println("ttb="+newbill);  
    }
}
