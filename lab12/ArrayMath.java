//Stutti Tilwa
//CSE 2
//Section 111
//November 8, 2014
//lab11

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }//end of main method
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }//end of display method
  
public static boolean equals(double[] array1, double [] array2)  {
    boolean isEqual=false;
    if (array1.length==array2.length) {
        for(int i=0;i<array1.length;i++){
            if(!(array1[i]==array2[i])){
                return isEqual;
            }
        }
        isEqual=true;
    }
    return isEqual;
}//end of equals method
  
public static double[] addArrays(double[] array1, double[] array2){
    int resultLength;
    
    if (array1.length>array2.length){
        resultLength=array1.length;
    }
    else {
        resultLength=array2.length;
    }
    
    double[] resultArray=new double[resultLength];
    
    for (int i=0;i<resultArray.length;i++){
        if(i>(array1.length-1)){
            resultArray[i]=array2[i];
        }
        else if(i>(array2.length-1)){
            resultArray[i]=array1[i];
        }
        else {
            resultArray[i]=array1[i]+array2[i];
        }
    }
     return resultArray;
}//end of add arrays method

  
}//end of class 
