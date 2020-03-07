
import java.util.Scanner;
public class CheckISBN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int []q=new int[9];
        System.out.print("Enter the first 9 digit of an ISBN as integer:");
        String number2;
        String number = input.next();
        number2=number;
        char[]c = number.toCharArray();
       for (int j=0; j<c.length; j++) {
            switch(c[j]){
                case '0': q[j]=0;break;
                case '1': q[j]=1;break;
                case '2': q[j]=2;break;
                case '3': q[j]=3;break;
                case '4': q[j]=4;break;
                case '5': q[j]=5;break;
                case '6': q[j]=6;break;
                case '7': q[j]=7;break;
                case '8': q[j]=8;break;
                case '9': q[j]=9;break;
            }
        }
        
        int result= (q[0] * 1 + q[1] * 2 + q[2] * 3 + q[3] * 4 + q[4] * 5 + q[5] * 6 + q[6] * 7 + q[7] * 8 + q[8] * 9) % 11;
        
        if( result == 10){
            char result1='X';
            System.out.println("The ISBN-10 number is "+number2+result1); 
        }
        else
        System.out.println("The ISBN-10 number is "+number2+result);
    
    }
}


