/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/11/2011 21:31:27
 * @author rafael.galvao
 */
public class Registro0110 extends LineArchetype {
    
    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Código indicador da incidência tributária no período:    
         * 1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo
         * 2 – Escrituração de operações com incidência exclusivamente no regime cumulativo
         * 3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo
    */
    public static String COD_INC_TRIB = "COD_INC_TRIB";
    //03
    /**Código indicador de método de apropriação de créditos comuns, no caso de incidência no regime não-cumulativo (COD_INC_TRIB = 1 ou 3):
         * 1 – Método de Apropriação Direta;
         * 2 – Método de Rateio Proporcional (Receita Bruta)
    */
    public static String IND_APRO_CRED = "IND_APRO_CRED";
    //04
    /**Código indicador do Tipo de Contribuição Apurada no Período
         * 1 – Apuração da Contribuição Exclusivamente a Alíquota Básica
         * 2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)
    */
    public static String COD_TIPO_CONT = "COD_TIPO_CONT";
    //05
    /**Código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro presumido:
         * 1 – Regime de Caixa – Escrituração consolidada (Registro F500);
         * 2 – Regime de Competência - Escrituração consolidada (Registro F550);
         * 9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”.
    */
    public static String IND_REG_CUM = "IND_REG_CUM";

    public Registro0110() {
        setName("Regimes de apuração da contribuição social e de apropriação de crédito");
        setDelimiter("|");
        
        FieldIntegerFixedLengthArchetype fdi = new FieldIntegerFixedLengthArchetype(1);
        fdi.setNullableRepresentation("");
        fdi.setFullFillingNullable(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0110"));
        //02
        addFieldArchetype(COD_INC_TRIB, new FieldIntegerFixedLengthArchetype(1));
        //03
        addFieldArchetype(IND_APRO_CRED, fdi);
        //04
        addFieldArchetype(COD_TIPO_CONT, fdi);
        //05
        addFieldArchetype(IND_REG_CUM, fdi);
    }
}
