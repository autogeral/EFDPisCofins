package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
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
        FieldStringMaximumLengthArchetype f02 = new FieldStringMaximumLengthArchetype(60);
        f02.setNullableRepresentation("");
        f02.setFullFillingNullable(false);
        addFieldArchetype(COD_EST, f02);
        //03
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        //04
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //05
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(14);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(IE, f06);
        //07
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        //08
        FieldStringMaximumLengthArchetype f08 = new FieldStringMaximumLengthArchetype(255);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(IM, f08);
        //09
        FieldStringFixedLengthArchetype f09 = new FieldStringFixedLengthArchetype(9);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(SUFRAMA, f09);
    }  
    
}
