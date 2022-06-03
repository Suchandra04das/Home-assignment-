package Basicprograms;//print 1 to n perfect number
import java.util.Scanner;

public class PerfectNumber {
    public void calculatePerfectNo(int no){//method creation
        int i,j,count;//variables declaration in method
        for(i=1;i<=no;i++){//calculation using for loop
            count=0;
            for(j=1;j<i;j++){
                if(i%j==0)
                    count=count+j;
            }
            if(count==i)
                System.out.println(count);
        }
    }//end method

    public static void main(String[] args) {
        int num;//variables declare in main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        num=sc.nextInt();//taking input from user
        PerfectNumber pl=new PerfectNumber();//invoking method
        pl.calculatePerfectNo(num);
    }//end main method
}






