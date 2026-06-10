// arry - inputs, outputs, updates.
import java.util.Scanner;

public class arry {
    public static void main (String args []){
        int marks []= new int [100];

        Scanner sc = new Scanner (System.in);

        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//che
        marks[2]=sc.nextInt();//math

        System.out.println("phy :" + marks[0]);
        System.out.println("che:"+ marks[1]);
        System.out.println("matm:"+ marks[2]);

        // updates
        marks[2]=85;
        System.out.println("math:"+marks[2]);
    }


}
