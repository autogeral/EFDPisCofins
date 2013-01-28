/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.sped.efd.pisCofins;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

/**
 * Jan 28, 2013 12:14:46 PM
 * @author Jennifer
 */
public class GerarDocumentoEFDPisCofins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {
        Registro0000Test registro0000Test = new Registro0000Test();
        Registro0001Test registro0001Test = new Registro0001Test();
        Registro0100Test registro0100Test = new Registro0100Test();
        Registro0110Test registro0110Test = new Registro0110Test();
        Registro0111Test registro0111Test = new Registro0111Test();
        Registro0140Test registro0140Test = new Registro0140Test();
        Registro0150Test registro0150Test = new Registro0150Test();
        
        //Gerar o arquivo em txt
        FileWriter fileWriter = new FileWriter("EDFPisCofinsTest.txt");
        BufferedWriter bf = new BufferedWriter(fileWriter);
        
        fileWriter.write(registro0000Test.linhaRegistro0000Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0001Test.linhaRegistro0001Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0100Test.linhaRegistro0100Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0110Test.linhaRegistro0110Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0111Test.linhaRegistro0111Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0140Test.linhaRegistro0140Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0150Test.linhaRegistro0150Test());
        bf.newLine();
        bf.flush();
        
        fileWriter.flush();
        fileWriter.close();
    }

}
