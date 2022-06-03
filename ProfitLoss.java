// find profit and loss
package Basicprograms;
import java.util.Scanner;
public class ProfitLoss {
    public void findPl(int costprice,int sellingprice){//method creation
        if(costprice<sellingprice){
          int profit = (sellingprice - costprice);
            System.out.println("it is profit and profit amount is: "+profit);
        }
        else if(costprice>sellingprice){
           int loss=(costprice-sellingprice);
            System.out.println("it is loss and loss amount is: "+loss);
        }
        else if(costprice==sellingprice){
                    System.out.println("no loss no profit ");}

    }//end method
    public static void main(String args[]){
        //declare variables
        int cp, sp;
        Scanner sc = new Scanner(System.in);//taking input from user
        System.out.println("Enter the cost price: ");
        cp= sc.nextInt();
        System.out.println("Enter the selling price: ");
        sp= sc.nextInt();
        // invoking method
        ProfitLoss obj = new ProfitLoss();
        obj.findPl(cp,sp);
    }
}
