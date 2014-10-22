//Stutti Tilwa
//CSE 2
//Section 111
//October 21, 2014
//hw07
//Number Stack

//Program that forces the user to enter an integer between 1 and 9, inclusive, 
//and then prints out displays that depend on the value entered
//as stacks of numbers

import java.util.Scanner; //importing scanner
public class NumberStack{ 
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in); //scanner contructor 
        System.out.print("Enter a number between 1 and 9- "); //prompts user to enter an integar between 1 and 9
        if (myScanner.hasNextInt()) { 
             int userInput = myScanner.nextInt(); //using input for scanner as an int
                if (userInput>0 && userInput<10){ //make sure user input is within the bounds 1 and 9
                
//FOR LOOP
System.out.println("Using For Loops: "); 
        int j; //initialize variables
        int k;
        int i;
        int x;
        int y;
    for (j=1;j<=userInput;j++) { //outer for loop
        for(y=1;y<=j;y++) { 
          for (k=1;k<=(userInput - j)+1;k++){ //nested loop prints out the spaces to format number stacks
              System.out.print(" "); //printing spaces 
          }//end of nested loop
          for (i=1;i<=(j*2)-1;i++){ //third for loop
            System.out.print(j); //printing the number stacks based on j
          } //end of third for loop
          System.out.println();
            } //end of second for loop
         for (k=1;k<=(userInput - j)+1;k++){ 
            System.out.print(" "); //need to print spaces
         }
         for (x=1;x<=(j*2)-1;x++){
             System.out.print("-"); //printing the dashes between the number stacks
         }
         System.out.println();
        }//end of outer loop
    
//WHILE LOOP
System.out.println("Using While Loops: "); //everything from loop broken up into nested while loops
        j=1;
    while (j<=userInput){ //first for loop converted to outter while loop
        y=1;
        while (y<=j){
            k=1;
           while (k<=(userInput - j)+1){ 
             System.out.print(" "); //printing spaces 
             k++;
           }
           i=1;
           while (i<=(j*2)-1) {
            System.out.print(j);
            i++;   
           } 
            System.out.println();
        y++;   
        }//2
    k=1;
    while (k<=(userInput - j)+1) {
    System.out.print(" ");
    k++;    
    }  
    x=1;
    while (x<=(j*2)-1){
    System.out.print("-");    
    x++;    
    }
    System.out.println();    
    j++;  
    }//end of outer while loop
    
    
//DO-WHILE LOOP
System.out.println("Using Do-While Loops: ");

//had to comment out do-while loop 
//because the loop keep running spaces infinitely 
//when this section of code was executed 
/*    j=1;
    do{
     y=1;
        do{//2
          k=1;
          do{//3
             System.out.print(" "); 
             k--;
              }while(k<j);//3  
                i=1;
              do{
                System.out.print(j);
                i++;
              }while(i<=(j*2)-1);
            System.out.println(); 
            y++;
            }while(y<=j); //2
            y=1;
            do{
            System.out.print(" ");
            y--;
            }while(y>j);
            x=1;
            do{
              x++;
             System.out.print("-"); 
            }while(x<=(j*2)-1);
            System.out.println(); 
            j++;
            } while(j<=userInput);//end of outter do  */
            
            
                }//end of second if statement
                else {
                    System.out.println("You did not enter an integar between 1 and 9!");
                }
        }//end of if statement
        else {
            System.out.println("You did not enter an integar!");
        } //end of else statement 
    } //end of method 
} //end of class