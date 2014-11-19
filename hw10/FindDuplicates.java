//Stutti Tilwa
//CSE 2
//Section 111
//November 4, 2014
//hw10
//Find Duplicates

//The program will test out how well the random generation of poker hands works. 

//Program 1
//The program FindDuplicates with two methods called in the main method, hasDups() and exactlyOneDup()
//The method hasDups() should return true if and only if the input array has at least one repeated entry. 
//The method exactlyOneDup() returns true if and only if there is exactly one repeated entry 

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array "; //avoid excessive calls to System.out.println() by building the output string “out” and occasionally printing it
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }//end of main method

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//end of listarray method
  
public static boolean hasDups(int [] array){
for(int i=0;i<array.length;i++){ //will run first element on the arrat
  for(int j=(i+ 1);j<array.length;j++){//wil run through rest of elements
  //want to compare one element with all other elements
  //then take the next element and compare with remaining elements 
    if(array[i]==array[j]){ 
      return true;
              }
    }
}
return false;

}//end of method hasdups
	
public static boolean exactlyOneDup(int [] array){
int counter=0;
for(int i=0; i<array.length;i++){
  for(int j=(i+ 1);j<array.length;j++){ 
    if(array[i]==array[j]){
    counter+=1; 
        }
    }  //if counter is more than one than the array has more than one duplicate and it will return false 
}
  if(counter==1){ 
    return true;
    }
  return false;

  }//end of method exactlyonedup
  
  
  
}// end of class


