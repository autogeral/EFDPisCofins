package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:55:58
 * @author rafael.galvao
 */
public class RegistroC010 extends LineArchetype{
    //01 - fixo
    public static String REG = "REG";
    //02 - Número de inscrição do estabelecimento no CNPJ.
    public static String CNPJ = "CNPJ";
    //03
    /**Indicador da apuração das contribuições e créditos, na escrituração das operações por NF-e e ECF, no período:
     * 1 – Apuração com base nos registros de consolidação das operações por NF-e (C180 e C190) e por ECF (C490);
     * 2 – Apuração com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)
     */
    public static String IND_ESCRI = "IND_ESCRI";
    
    public RegistroC010() {
        setName("Identificação dos estabelecimento");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C010"));
        //02
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //03
        FieldStringFixedLengthArchetype f03 = new FieldStringFixedLengthArchetype(1);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(IND_ESCRI, f03);
        
        
    }
}
