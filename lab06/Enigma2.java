//Stutti Tilwa
//CSE 2
//Section 111
//October 10, 2014
//lab06
//Enigma 2

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40; //took out the division by 0 
    }
    System.out.println(out);
  }
}

/* 
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * 
 * 1) cannot divide by 0 --> will give you a runtime error...get rid of 0 in line 16
 * 
 * 
 */
