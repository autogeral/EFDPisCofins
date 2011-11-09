/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:01:56
 * @author rafael.galvao
 */
public class Registro0200 extends LineArchetype {
     public static final String REG = "REG";
     public static final String COD_ITEM= "COD_ITEM";
     public static final String  DESCR_ITEM = "DESCR_ITEM";
     public static final String COD_BARRA = "COD_BARRA";
     public static final String COD_ANT_ITEM = "COD_ANT_ITEM";
     public static final String UNID_INV = "UNID_INV";
     public static final String TIPO_ITEM = "TIPO_ITEM";
     public static final String COD_NCM = "COD_NCM";
     public static final String  EX_IPI = "EX_IPI";
     public static final String COD_GEN = "COD_GEN";
     public static final String COD_LST = "COD_LST";
     public static final String ALIQ_ICMS = "ALIQ_ICMS";
     
     public Registro0200(){
         addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
         addFieldArchetype(COD_ITEM, new FieldStringFixedLengthArchetype(60));
         addFieldArchetype(DESCR_ITEM, new FieldStringFixedLengthArchetype(255));
         addFieldArchetype(COD_BARRA, new FieldStringFixedLengthArchetype(255));
         addFieldArchetype(COD_ANT_ITEM, new FieldStringFixedLengthArchetype(60));
         addFieldArchetype(UNID_INV, new FieldStringFixedLengthArchetype(6));
         addFieldArchetype(TIPO_ITEM, new FieldIntegerFixedLengthArchetype(2));
         addFieldArchetype(COD_NCM, new FieldStringFixedLengthArchetype(8));
         addFieldArchetype(EX_IPI, new FieldStringFixedLengthArchetype(3));
         addFieldArchetype(COD_GEN, new FieldIntegerFixedLengthArchetype(2));
         addFieldArchetype(COD_LST, new FieldIntegerFixedLengthArchetype(4));
         addFieldArchetype(ALIQ_ICMS, new FieldDecimalFixedLengthArchetype(6,2));
     }

}
