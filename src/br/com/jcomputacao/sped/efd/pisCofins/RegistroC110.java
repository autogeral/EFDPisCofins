package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 21:33:36
 * @author rafael.galvao
 */
public class RegistroC110 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
    public static String COD_INF = "COD_INF";
    //03 - Descrição complementar do código de referência.
    public static String TXT_COMPL = "TXT_COMPL";
    
    public RegistroC110(){
        setName("Complemento do documento - informação complementar da nota fisca (códigos 01, 1B e 55)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C110"));
        //02
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        //03
        FieldStringMaximumLengthArchetype f03 = new FieldStringMaximumLengthArchetype(255);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(TXT_COMPL,  f03);
        
    }
}
