// keet entering your number till user enter a multipal of 1050

import java.util.*;
public class breakstatement {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        do { 
            System.out.println("enter your number :");
            int n=sc .nextInt();
            if(n % 10== 0){
                break;
            }
            System.out.println(n);
        } while (true);
    }
    
}
