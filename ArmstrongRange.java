package Basicprograms;//program to find ArmStrong number into given range
import java.util.Scanner;
public class ArmstrongRange {
    public void calculateArmstrongRange(int num){//create method
        int i,temp,count,sum,rem;//variables declare
        for(i=1;i<=num;i++){
            temp=i;//holding the value in temp for further use
            count=0;sum=0;//initialization of count and sum
            while(temp>0){
                temp=temp/10;
                count++;
            }//counting the no of digit in a number
            temp=i;
            while(temp>0){
                rem=temp%10;//hold the remainder in rem
                sum+=Math.pow(rem,count);
                temp=temp/10;
            }//internal loop for calculation of armstrong number
            if(i==sum)// checking the sum is equal or not with number
                System.out.println(sum);
        }//external loop for creating range
    } public static void main(String[] args) {
        int number; //variable declare in main method
        System.out.println("Enter any num: ");
        Scanner sc=new Scanner(System.in); //taking input from user
        number=sc.nextInt();
        ArmstrongRange obj = new ArmstrongRange();//invoking method
        System.out.println("The Armstrong numbers between 1 to "+ number + " are: " );
        obj.calculateArmstrongRange(number);
}}
