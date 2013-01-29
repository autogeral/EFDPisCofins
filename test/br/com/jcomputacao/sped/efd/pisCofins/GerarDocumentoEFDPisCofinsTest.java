package br.com.jcomputacao.sped.efd.pisCofins;

import java.io.*;
import java.text.ParseException;

/**
 * Jan 28, 2013 12:14:46 PM
 * @author Jennifer
 */
public class GerarDocumentoEFDPisCofinsTest {

    public static void main(String[] args) throws ParseException, IOException {
        //Gerar o arquivo em txt
        String nomeArquivo = "EDFPisCofinsTest";
        String extensaoArquivo = ".txt";
        FileWriter fileWriter = new FileWriter(nomeArquivo+extensaoArquivo);
        BufferedWriter bf = new BufferedWriter(fileWriter);
        int numLinhas;
        //BLOCO 0
        Registro0000Test registro0000Test = new Registro0000Test();
        Registro0001Test registro0001Test = new Registro0001Test();
        Registro0100Test registro0100Test = new Registro0100Test();
        Registro0110Test registro0110Test = new Registro0110Test();
        Registro0111Test registro0111Test = new Registro0111Test();
        Registro0140Test registro0140Test = new Registro0140Test();
        Registro0150Test registro0150Test = new Registro0150Test();
        Registro0190Test registro0190Test = new Registro0190Test();
        Registro0200Test registro0200Test = new Registro0200Test();
        Registro0205Test registro0205Test = new Registro0205Test();
        Registro0206Test registro0206Test = new Registro0206Test();
        Registro0208Test registro0208Test = new Registro0208Test();
        Registro0400Test registro0400Test = new Registro0400Test();
        Registro0450Test registro0450Test = new Registro0450Test();
        Registro0500Test registro0500Test = new Registro0500Test();
        Registro0600Test registro0600Test = new Registro0600Test();
        //ENCERRAMENTO DO BLOCO 0
        Registro0990Test registro0990Test = new Registro0990Test();
        //BLOCO A
        RegistroA001Test registroA001Test = new RegistroA001Test();
        RegistroA010Test registroA010Test = new RegistroA010Test();
        RegistroA100Test registroA100Test = new RegistroA100Test();
        RegistroA110Test registroA110Test = new RegistroA110Test();
        RegistroA111Test registroA111Test = new RegistroA111Test();
        RegistroA120Test registroA120Test = new RegistroA120Test();
        RegistroA170Test registroA170Test = new RegistroA170Test();
        
        //linhas do documento 
        //Bloco 0
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
        fileWriter.write(registro0190Test.linhaRegistro0190Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0200Test.linhaRegistro0200Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0205Test.linhaRegistro0205Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0206Test.linhaRegistro0206Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0208Test.linhaRegistro0208Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0400Test.linhaRegistro0400Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0450Test.linhaRegistro0450Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0500Test.linhaRegistro0500Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registro0600Test.linhaRegistro0600Test());
        bf.newLine();
        bf.flush(); 
            numLinhas = contaLinhasBloco(nomeArquivo, extensaoArquivo, "0");
            fileWriter.write(registro0990Test.linhaRegistro0990Test(numLinhas));
            bf.newLine();
            bf.flush();
        //Bloco A
        fileWriter.write(registroA001Test.linhaRegistroA001Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registroA010Test.linhaRegistroA010Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registroA100Test.linhaRegistroA100Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registroA110Test.linhaRegistroA110Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registroA111Test.linhaRegistroA111Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registroA120Test.linhaRegistroA120Test());
        bf.newLine();
        bf.flush();
        fileWriter.write(registroA170Test.linhaRegistroA170Test());
        bf.newLine();
        bf.flush();
        
        
        fileWriter.flush();
        fileWriter.close();
    }
    
    public static int contaLinhasBloco (String nomeArquivo, String extensaoArquivo, String bloco) throws FileNotFoundException, IOException{
        FileReader ler = new FileReader(nomeArquivo+extensaoArquivo);  
        BufferedReader leitor = new BufferedReader(ler);  
        String linha;
        int count=0;
        
        while ((linha = leitor.readLine()) != null && linha.startsWith("|"+bloco)){
            count++;
        }        
        return count;
    }

}
