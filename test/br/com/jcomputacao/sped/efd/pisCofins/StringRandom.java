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
public class StringRandom {
    
    public String GeraStringRandom(int tamanho){
        String Str = "";
        while (Str.length() < tamanho) {
            Random r = new Random();
            Str += (char) r.nextInt(200);
        }    
      return Str;
    }
    
}
