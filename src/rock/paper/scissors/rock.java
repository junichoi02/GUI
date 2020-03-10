/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock.paper.scissors;

import java.util.Scanner;
import java.util.Random;

public class rock {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Random rand = new Random();
        String you, com;
            int won = 0, lost = 0, drawed = 0;

                for(int g=0;g<5;g++){
                    do{
                        System.out.print("Rock Scissors Paper : ");
you = scan.next();
if(you.equals("Scissors") || you.equals("Rock") || you.equals("Paper")) break;
System.out.println("You entered wrong value");
}while(true);

com = new String[]{"Scissors", "Rock", "Paper"}[rand.nextInt(3)];

System.out.println("Computer Showed "+com+"");

if(you.equals(com)){
System.out.println("Tie"); drawed++;
}else if(you.equals("Scissors")){
if(com.equals("Paper")){
System.out.println("Victory"); won++;
}else{
System.out.println("Defeat"); lost++;
}
}else if(you.equals("Rock")){
if(com.equals("Scissors")){
System.out.println("Victory"); won++;
}else{
System.out.println("Defeat"); lost++;
}
}else if(you.equals("Paper")){
if(com.equals("Rock")){
System.out.println("Victory"); won++;
}else{
System.out.println("Defeat"); lost++;
}
}

}

System.out.print("5 Series ");
if(won > 0) System.out.print(won+"Wins ");
if(drawed > 0) System.out.print(drawed+"Ties ");
if(lost > 0) System.out.print(lost+"Loses ");

System.out.println();
}
}


