/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import java.util.Random;


/**
 * 10/11/2011 20:04:58
 * @author Jonas
 */
public class Randomize {
    
    public String GeraStringRandom(int tamanho){
        String Str = "";
        while (Str.length() < tamanho) {
            Random r = new Random();
            Str += (char) r.nextInt(255);
        }    
      return Str;
    }
    
     public long GeraLongRandom(long tamanho){
        String Str = "";
        while (Str.length() < tamanho) {
            Random r = new Random();
            Str +=  r.nextLong();
        }    
      return Long.parseLong(Str);
    }
     
      public int GeraIntRandom(int tamanho){
        String Str = "";
        while (Str.length() < tamanho) {
            Random r = new Random();
            Str +=  r.nextInt();
        }    
      return Integer.parseInt(Str);
    }
      
       public double GeraDoubleRandom(int tamanho){
        String Str = "";
        while (Str.length() < tamanho) {
            Random r = new Random();
            Str +=  r.nextDouble();
        }    
      return Double.parseDouble(Str);
    }
    
}
