package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 09/11/2011 11:47:59
 * @author WILL
 */
public class Registro0208 extends LineArchetype {
    //01 - Fixo
    public static final String REG = "REG";
    //02
    /**Código indicador da Tabela de Incidência, conforme Anexo III do Decreto nº 6.707/08: 
     * 01 – Tabela I 
     * 02 – Tabela II 
     * 03 – Tabela III 
     * 04 – Tabela IV 
     * 05 – Tabela V
     * 06 – Tabela VI 
     * 07 – Tabela VII 
     * 08– Tabela VIII 
     * 09 – Tabela IX 
     * 10 – Tabela X 
     * 11 – Tabela XI 
     * 12 – Tabela XII
     */
    public static final String COD_TAB = "COD_TAB";
    //03 - Código do grupo, conforme Anexo III do Decreto nº 6.707/08.
    public static final String COD_GRU= "DT_INI";
    //04 - Marca Comercial
    public static final String MARCA_COM= "DT_FIM";
   
    
        public Registro0208(){
        setName("Código de grupos por marca comercial - Refri (Bebidas frias)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0208"));
        //02
        addFieldArchetype(COD_TAB, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(COD_GRU, new FieldStringFixedLengthArchetype(2));
        //04
        addFieldArchetype(MARCA_COM, new FieldStringMaximumLengthArchetype(60));
        
    }
    
}
