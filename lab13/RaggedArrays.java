//Stutti Tilwa
//CSE 2
//Section 111
//December 2014
//lab13

//Write a program that creates a two dimensional ragged array of five rows of ints. 
//The length the 0th row should be 5, the 1th row 8, etc. 
//That is, for the jth row, the length should be j*3+5. Then
//Fill the array with random numbers in the range 0...39, inclusive.
//Display the array
//Sort each row of the array in ascending order
//Display the array.

import java.util.Arrays;
public class RaggedArrays{
	public static void main(String[] args) {
System.out.println("The array before sorting");
int[][] array=new int [5][];
for (int j=0;j<5;j++) {
array[j]=new int[j*3+5];

int [] array2=new int [j*3+5];
    for (int k=0; k<(j*3+5); k++) {
        array2[k]= (int) Math.floor(Math.random()*39);
 }
 
array[j]=array2;
} 

for(int x=0; x<5; x++){
    for(int y=0;y<x*3+5;y++){
     System.out.print(array[x][y] +" ");   
    }
    System.out.println();
}

sortArray(array);
System.out.println();

System.out.println("The array after sorting");
for(int x=0; x<5; x++){
    for(int y=0;y<x*3+5;y++){
     System.out.print(array[x][y] +" ");   
    }
    System.out.println();
}
	    
    }//end of main method
    
    public static void sortArray(int [][] array){
        for (int row=0;row<5;row++){
            for(int column=0;column<row*3+5;column++){
                for(int secondColumn=column+ 1; secondColumn<row*3+5;secondColumn++){
                    if(array[row][secondColumn]<array[row][column]){
                        int temp=array[row][column];
                        array[row][column]=array[row][secondColumn];
                        array[row][secondColumn]=temp;
                    }
                }
            }
        }
    }
}//end of class
