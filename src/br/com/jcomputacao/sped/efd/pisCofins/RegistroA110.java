package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 09/11/2011 20:11:35
 * @author Jonas
 */
public class RegistroA110 extends LineArchetype{
    //01 - Fixo
     public static String REG = "REG";
     //02 - Código da informação complementar do documento fiscal 
     //(Campo 02 do Registro 0450)
     public static String COD_INF = "COD_INF";
     //03 - Informação Complementar do Documento Fiscal
     public static String TXT_COMPL = "TXT_COMPL";
    
    
     public RegistroA110(){
         setName("Complemento do documento - informação complementar da NF");
         setDelimiter("|");
         //01
         addFieldArchetype(REG, new FieldDefaultArchetype("A110"));
         //02
         addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
         //03
         addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
     }
}
