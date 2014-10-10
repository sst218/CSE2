//Stutti Tilwa
//CSE 2
//Section 111
//October 10, 2014
//lab06
//Enigma 0

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n = 0; //n is initialized 
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
}
    else{
      n=4; //declared 
      System.out.println("You entered "+n);
    }
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24:
      case 25: 
        System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 n was not initialized 
 and every time after it should not be initialized again but rather simply declared
 swtich statement 
 *   Explain the error(s) that occurred here, and then fix them
 */
