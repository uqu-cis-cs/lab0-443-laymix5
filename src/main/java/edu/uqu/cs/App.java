package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print ""
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
   public static void main(String[] args) {
        
     
           twisters();
           System.out.println("enter a string");
           Scanner scan=new Scanner(System.in);
           String word=scan.nextLine();
           System.out.println(phoneKeypad(word));
    }   
          
    
    public static void twisters(){
      
   
 
        // TODO code application logic here
   
    String[] words = {"", "Tweetle", "", "Beetle", "", "Poodle"};
    for (int i = 1; i <= 110; i++) {
        String output = "";
        if (i % 2 == 0) {
            output += words[1];
        }
        if (i % 4 == 0) {
            output += words[3];
        }
        if (i % 6 == 0) {
            output += words[5];
        }
        if (output.equals("")) {
            output += i;
        }
        System.out.print(output + " ");
        if (i % 11 == 0) {
            System.out.println();
        }
    }
}
    
    public static String phoneKeypad( String str ) {
    String nums = "" ;
    str =str.toUpperCase() ;
    for ( int i = 0 ; i <= str.length() -1 ; i++ ) {
        switch ( str.charAt(i) ) {
            case 'A':
            case 'B':
            case'C' :
            nums += 2 ;
            break;
            
            case 'D' :
            case'E' :
            case'F' :
            nums += 3 ;
            break;
            
            case 'G' :
            case  'H' : 
            case 'I' : 
            nums += 4 ;
            break;
            
            case 'J' :
            case'K' :
            case'L' :
            nums += 5 ;
            break;
            
            case 'M' :
            case 'N' :
            case 'O' :
            nums += 6 ;
            break;
            
            case 'P' :
            case 'Q' :
            case 'R' : 
            case 'S' :
            nums += 7 ;
            break;
            
            case 'T' :
            case 'U' :
            case 'V' :
            nums += 8 ;
            break;
            case 'W' : 
            case 'X' :
            case 'Y' :
            case 'Z' :
            nums += 9 ;
            break;
            
        }
    }
    
    return nums ;
    
}

    }

    
