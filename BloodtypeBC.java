/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodtypebc;
import java.util.Scanner;
import java.util.Timer;

public class BloodtypeBC {

    public static void play1(){
        
        String[] first = new String[]{"a", "b", "c"};
        String[] second = new String[]{"aa","ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc"};
        int firstChoice = (int)(Math.random() * 3);
        int secondChoice = (int)(Math.random() * 9);
        int score = 0;
        
        
        for(int i = 0; i < 11; i++){
        
        System.out.println("Get medicine " + first[(int)(Math.random() * 3)]);
        
        for(int i2 = 0; i < 11; i2++){
            
        Scanner input = new Scanner(System.in);
        String Words = input.nextLine();
        
        if(Words.equals(first[(int)(Math.random() * 3)])){
        System.out.println("Score " + score);
        score = score + 1;
        break;
        
        }else if(!Words.equals(first[(int)(Math.random() * 3)])){
        System.out.println("Game over");
        System.out.println("Score: " + score);
        break;
        }
        
        }
        
    }
    }
    
    public static void main(String[] args) {
       play1();
    }
    
}
