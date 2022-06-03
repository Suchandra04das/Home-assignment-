package Basicprograms; // calculation of gross salary
import java.util.Scanner;
public class GrossSalary {
    double basic,hra,da;
    public void calculateGross(int basic) { //method creation
        if (basic <= 10000) {
             hra = 0.2 * basic;
             da = 0.8 * basic;
        } else if (basic >= 10001 && basic <= 20000) {
             hra = 0.25 * basic;
           da = 0.9 * basic;
        } else if (basic >= 20001) {
             hra = 0.3 * basic;
             da = 0.95 * basic;
        }
        double gross=basic+hra+da;
        System.out.println("the gross amount is: "+gross);
    }
    //end method
    public static void main(String[] args) {
        int bsc; //variables declaration
        Scanner sc=new Scanner(System.in);//taking input from user
        System.out.println("Enter the basic value: ");
        bsc=sc.nextInt();
        GrossSalary gl=new GrossSalary(); //invoking method
        gl.calculateGross(bsc);
    }
}
