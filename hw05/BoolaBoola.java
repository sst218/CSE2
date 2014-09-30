//Stutti Tilwa
//CSE 2
//Section 111
//September 30, 2014
//hw04
//Boola Boola

//Has three boolean variables to each of which the value of true or false is randomly assigned.
//Then, at random, combine the three variables with random choices of && and || and stores the result.
//The program should then present the expression to the user and ask the user to state the result of of the expression.

import java.util.Scanner;

public class BoolaBoola{
    public static void main(String[] args) {

Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
//declaring variables 
int Boola1, Boola2, Boola3;
//generating randoms
int operatorBoola1= (int)(Math.random()*2);
int operatorBoola2= (int)(Math.random()*2);
//generating randoms for booleans
Boola1=(int)(Math.random()*2);
Boola2=(int)(Math.random()*2);
Boola3=(int)(Math.random()*2);
// using switch statements to assign operators 
String operator1= "";
    switch (operatorBoola1) //random operator generating 
    {
        case 0: 
            operator1 = "&&" ;
        break;
        case 1:
            operator1 = "||" ;
        break;
    }

String operator2 = "";
    switch (operatorBoola2) //random operator generating 
    {
        case 0:
            operator2 = "&&" ; 
        break;
        case 1:
            operator2 = "||" ;
        break;
    }
//using switch statements to assign true or false values for first Boolean
String boolaString1 = "";
    switch (Boola1) 
   {
        case 0:
            boolaString1 = "true";
        break;
        case 1:
            boolaString1 = "false";
        break;
    }
//using switch statements to assign true or false values for second Boolean
String boolaString2 = "";
    switch (Boola2)
    {
        case 0:
            boolaString2 = "true";
        break;
        case 1:
            boolaString2 = "false";
        break;
    }
//using switch statements to assign true or false values for third Boolean
String boolaString3 = "";
    switch (Boola3)
    {
        case 0:
            boolaString3 = "true";
        break;
        case 1:
            boolaString3 = "false";
        break;
    }
//program should then present the expression to the user and ask the user to state the result of of the expression
System.out.print("Does " + boolaString1 + " " + operator1+ " " + boolaString2+ " " + operator2+ " " + boolaString3 + " " + "have the value true(t/T) or false(f/F)? ");
String userInput = myScanner.next();

String realAnswer = "";
//below is part of program that stores the answers to statements 
/* if(userInput.equals("T") || userInput.equals("t") || userInput.equals("F") || userInput.equals("f")) {
    
if ((operator1 = "&&") && (operator2 = "&&") ) {
    if(boolaString1 = true && boolaString2 = true && boolaString3 = true) { 
    realAnswer = true;    
        
    }
    else 
    realAnswer = false;
    }
    
if ((operator1 = "||") && (operator2 = "||")) {
    if((boolaString1 = true) || (boolaString2 = true) || (boolaString3 = true) ) {
    realAnswer = true;
    }
    else
    realAnswer = false;
    }

if ((operator1 = "&&") && (operator2 = "||")) {
    if ((boolaString1 = true) && (boolaString2 = true) || (boolaString3=true)){
    realAnswer = true;
    }
    else
    realAnswer = false;
    } 

if ((operator1 = "||") && (operator2 = "&&")) {
    if ((boolaString1 =true) || (boolaString2 = true) && (boolaString3 = true)) {
    realAnswer = true;  
    }
    else 
    realAnswer = false;
    }

if (realAnswer == false) {
    System.out.println("Wrong, try again"); //if user entered wrong answer
}
else if (realAnswer == true) {
    System.out.println("Correct!"); //if user entered right answer
}
else {
    System.out.println("Wrong, try again!"); 
}
} 
    else{
        System.out.println("You did not enter one of 't', 'T', 'F', 'f'");
        return; */
        
                
    } //end of main method
} //end of class