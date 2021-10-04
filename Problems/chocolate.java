// Chocolate

// you have 15 rs and you can buys 1 chocolate at the price of 1 rs
// if you collect 3 wrapers of chocolate then you can buy 1 chocolate 
//  how many chocolate you can buy

// 1 re --> 1 chocolate
// 3 wrapers --> 1 chocolate

package Problems;
import java.text.ChoiceFormat;
import java.util.*;
public class chocolate {
    public static int wraperCount(int chocolate,int wraper){
       
        if(chocolate<wraper){
            return 0;
        }
        else{
            int NewChocolate=chocolate/wraper;
            // chocolate % Wraper is used to get remaining no of those wraper which are not used to buy chocolate
            // wrapers which are left after conversion. these wraper can be used after exchanging all wraper to buys chocolate and with this new chocolate's wrapper 
            // we can add this wraper with another wraper to buy new one
            return NewChocolate + wraperCount(NewChocolate+chocolate%wraper,wraper); 
        }
    }
    public static int totalChocolate(int money,int chocolate_price,int wraper){
        int chocolate =money/chocolate_price;
        return chocolate+ wraperCount(chocolate,wraper);

    }
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       int Total_money=15;
       int chocolate_price=1;
       int wraper=3;
       System.out.print(totalChocolate(Total_money,chocolate_price,wraper));
       
        

    }
    
}
