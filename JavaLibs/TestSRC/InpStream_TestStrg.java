/**
  *
  * <Beschreibung>
  *  Hilfspacket um Einzeltastendr�cke in
  *  Anf�ngerprogrammen / Consolenprogrammen
  *  als Eingabe zu verarbeiten
  *
  * @version 1.0 vom 29.02.2012
  * @author  R. Goldau
  */

import Prog2Tools.*;
public class InpStream_TestStrg {

  public static void main (String[] args) {
  
    String s="";
    System.out.println("** Es werden 10 Zeichen einzeln eingelesen und aneinandergeh�ngt **");
    
    for(int i=0;i<10;i++){
      s=s+InpStream.getKey();
      System.out.println(s);
    }

  }
}

