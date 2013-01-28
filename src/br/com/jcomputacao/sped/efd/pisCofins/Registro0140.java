/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 09/11/2011 09:41:17
 * @author WILL
 */
public class Registro0140 extends LineArchetype {
    //01 - Fixo
    public static final String REG = "REG";
    //02 - Código de identificação do estabelecimento
    public static final String COD_EST = "COD_EST";
    //03 - Nome empresarial do estabelecimento
    public static final String NOME = "NOME";
    //04 - Número de inscrição do estabelecimento no CNPJ.
    public static final String CNPJ = "CNPJ";
    //05 - Sigla da unidade da federação do estabelecimento.
    public static final String UF = "UF";
    //06 - Inscrição Estadual do estabelecimento, se contribuinte de ICMS.
    public static final String IE = "IE";
    //07 - Código do município do domicílio fiscal do estabelecimento, 
    //conforme a tabela IBGE
    public static final String COD_MUN = "COD_MUN";
    //08 - Inscrição Municipal do estabelecimento, se contribuinte do ISS.
    public static final String IM = "IM";
    //09 - Inscrição do estabelecimento na Suframa
    public static final String SUFRAMA = "SUFRAMA";
     


    public Registro0140(){
        setName("Tabela de cadastro de estabelecimento");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0140"));
        //02
        addFieldArchetype(COD_EST, new FieldStringMaximumLengthArchetype(60));
        //03
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        //04
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //05
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        //06
        addFieldArchetype(IE, new FieldStringMaximumLengthArchetype(14));
        //07
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        //08
        addFieldArchetype(IM, new FieldStringMaximumLengthArchetype(255));
        //09
        addFieldArchetype(SUFRAMA, new FieldStringFixedLengthArchetype(9));
    }  
    
}
