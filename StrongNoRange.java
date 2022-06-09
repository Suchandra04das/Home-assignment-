package Basicprograms;//program to find Strong number into given range
import java.util.Scanner;
public class StrongNoRange {
    public static int fact(int num) {//creation of fact method
        int f=1, j;//variables declare
        for (j = 1; j <= num; j++) {//calculate factorial of numbers using for loop
            f = j * f;
        }
        return f;
    }//end of fact method
            public void findStrong(int n){// method of calculation of strong number
                int  i,temp,factorial, rem, c;//variables declare
                for(i=1;i<=n;i++){
               temp=i;//holding the input for future use
               c=0;//initialization of c
               while (temp > 0) {
                    rem = temp % 10; //holding the remainder
                    factorial=fact(rem);//invoking fact method
                    c = c + factorial;
                    temp = temp / 10;}
                if (c == i) //checking the value of i is equal or not with c
                    System.out.println(c);
        }}//end method
    public static void main(String[] args) {
        int number; //variable declare in main method
        System.out.println("Enter any num: ");
        Scanner sc=new Scanner(System.in); //taking input from user
        number=sc.nextInt();
        StrongNoRange obj = new StrongNoRange();//invoking method
        System.out.println("The Strong numbers between 1 to "+ number +" are: ");
        obj.findStrong(number);

}}
