//Stutti Tilwa
//CSE 2
//Section 111
//December 5, 2014
//hw11
//Matrix Sorter 

//Should return a ragged 3D array, where the first slab has three rows, 
//the second slab five rows, and the third slab seven rows.
//Within the sth slab, the jth row should have s+j+1 columns.
//The ragged 3D array should be initialized with random numbers in the range 1..99, inclusive.
//The method show() should print out the array (all slabs).
//The method findMin() should find the smallest entry in the array. 
//The method sort() should take as input a ragged 2D array.

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }//end of main method
   
//must contruct a 3d    
public static int [][][] buildMat3d(){
  int mat3d[][][]=new int[3][][];
 for (int i=0;i<mat3d.length;i++){
   mat3d[i]=new int[3 + 2 *i][];
   for (int j=0;j<mat3d[i].length;j++){
     mat3d[i][j]=new int [i+j+ 1];
     for(int k=0;k<mat3d[i][j].length;k++){
       mat3d[i][j][k]=((int)Math.floor(Math.random()*99)+1); //initialized with random numbers in the range 1..99
     }
   }
 }
 return mat3d;
}   //end of build method

//printing out the array (all slabs)
public static void show(int[][][] array){
  for (int i=0;i<array.length;i++){
    System.out.println("---------------------------Slab "+(i+ 1));
    for (int j=0;j<array[i].length;j++){
      for (int k=0;k<array[i][j].length;k++){
        System.out.print(array[i][j][k]+ " ");
      }
      System.out.println();
    }
  }
   System.out.println("---------------------------");
}//end of show method

//finding the smallest entry in the array
public static int findMin(int[][][] array){
  int minHolder=array[0][0][0];
  for (int i=0;i<array.length;i++){
    for (int j=0;j<array[i].length;j++){
      for (int k=0;k<array[i][j].length;k++){
        if(minHolder>array[i][j][k]){
          minHolder=array[i][j][k];
        }
      }
    }
  }
  return minHolder;
}//end of find min method 

//sort should take as input a ragged 2D array
public static void sort(int[][] array){
  for (int i=0; i<array.length;i++){
    for (int j=0;j<array[i].length;i++){
      sort(array[j]);
    }
  }
}//end of sort method

public static void sort(int[] array){
  for(int i=0;i<array.length- 1;i++){
    int currentMin=array[i];
    int currentMinIndex=i;
    
    for (int j=i+ 1;j<array.length;j++){
      if(currentMin> array[j]){
        currentMin=array[j];
        currentMinIndex=j;
      }
    }
    //swap array[i] with array[currentMinIndex] if necessary
    if (currentMinIndex != i){
      array[currentMinIndex]=array[i];
      array[i]=currentMin;
    }
  }
  
}//end of sort
   
}//end of class