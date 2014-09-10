//Stutti Tilwa
//CSE 2
//Section 111
//September 9, 2014
//hw02
//Arithmetic 
//Meant to compute the cost of items bought on trip to Walmart
//Including PA sales tax of six percent 
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic 

public class Arithmetic{
    public static void main(String[] args)  {
//input data 
//Number of pairs of socks 
    int nSocks=3;
//Cost per pair of socks
    double sockCost$=2.58;
//Number of drinking glasses
    int nGlasses=6;
//Cost per glass
    double glassCost$=2.29;
//Number of boxes of envelopes 
    int nEnvelopes=1;
//cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
//total cost of socks 
    double totalSockCost$=nSocks*sockCost$;
//total sales tax for socks
    double salestaxSock$=totalSockCost$*taxPercent;
//total cost of drinking glasses
    double totalGlassCost$=nGlasses*glassCost$;
//total sales tax for drinking glasses 
    double salestaxGlass$=totalGlassCost$*taxPercent;
//total cost of envelopes 
    double totalEnvelopeCost$=nEnvelopes*envelopeCost$; 
//total sales tax for envelopes
    double salestaxEnvelope$=totalEnvelopeCost$*taxPercent;
//total cost of entire purchase before tax 
    double totalCostPurchase$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
//total paid for this transaction
    double totalpaid$=(totalCostPurchase$)+(totalCostPurchase$*taxPercent);
//rounding all values so that there are only 2 digits after decimal point  
    int round=(int)(totalSockCost$*100);
    totalSockCost$=round/100.0;
    round=(int)(salestaxSock$*100);
    salestaxSock$=round/100.0;
    round=(int)(totalGlassCost$*100);
    totalGlassCost$=round/100.0;
    round=(int)(salestaxGlass$*100);
    salestaxGlass$=round/100.0;
    round=(int)(totalEnvelopeCost$*100);
    totalEnvelopeCost$=round/100.0;
    round=(int)(salestaxEnvelope$*100);
    salestaxEnvelope$=round/100.0;
    round=(int)(totalCostPurchase$*100);
    totalCostPurchase$=round/100.0;
    round=(int)(totalpaid$*100);
    totalpaid$=round/100.0;
    
    System.out.println("Total Cost of Socks="+totalSockCost$);
    System.out.println("Total Cost of Drinking Glasses="+totalGlassCost$);
    System.out.println("Total Cost of Envelopes="+totalEnvelopeCost$);
    System.out.println("Total Sales Tax for Socks="+salestaxSock$);
    System.out.println("Total Sales Tax for Drinking Glasses="+salestaxGlass$);
    System.out.println("Total Sales Tax for Envelopes="+salestaxEnvelope$);
    System.out.println("Total Cost of Purchases Before Tax="+totalCostPurchase$);
    System.out.println("Total Paid For This Transaction Including Sales Tax="+totalpaid$);
    
    }
}


