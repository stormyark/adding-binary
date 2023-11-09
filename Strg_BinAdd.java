import Prog1Tools.*;

public class Strg_BinAdd {
  
  public static void main(String[] args) {
    
    String Decimal = IOTools.readString("Binär in Dezimal: ");
    int bin2dec = Integer.parseInt(Decimal, 2);
    System.out.println(bin2dec);
    
    int bin3dec = Integer.parseInt(Decimal, 10);
    String bin = IOTools.readString("Eine Dezimal Zahl zu "+bin3dec+" ("+bin2dec+") addieren: ");
    int dec = Integer.parseInt(bin, 2);
    int res = dec + bin2dec;
    System.out.println("Das Ergebnis ist: " +res);
    
  } // end of main

} // end of class Strg_BinAdd
