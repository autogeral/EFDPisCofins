/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 10/11/2011 20:00:45
 * @author rafael.galvao
 */
public class RegistroC170Test {

    public RegistroC170Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class RegistroC170.
     */
    @Test
    public void RegistroC170Test() {
        RegistroC170 reg = new RegistroC170();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroC170.REG, "0123");
        line.setFieldValue(RegistroC170.NUM_ITEM, 123L);
        line.setFieldValue(RegistroC170.COD_ITEM, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        line.setFieldValue(RegistroC170.DESCR_COMPL, "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        line.setFieldValue(RegistroC170.QTD, 1234567891234567891.66666);
        line.setFieldValue(RegistroC170.UNID, "asdfgj");
        line.setFieldValue(RegistroC170.VL_ITEM, 12345678912345678912.32);
        line.setFieldValue(RegistroC170.VL_DESC, 78945646789456789456.65);
        line.setFieldValue(RegistroC170.IND_MOV, "d");
        line.setFieldValue(RegistroC170.CST_ICMS, 123L);
        line.setFieldValue(RegistroC170.CFOP, 1234L);
        line.setFieldValue(RegistroC170.COD_NAT, "asdfghjklçl");
        line.setFieldValue(RegistroC170.VL_BC_ICMS, 11223344556677889912.22);
        line.setFieldValue(RegistroC170.ALIQ_ICMS, 77889966554411233221.66);
        line.setFieldValue(RegistroC170.VL_ICMS, 456789.66);
        line.setFieldValue(RegistroC170.VL_BC_ICMS_ST, 789456123321456987.66);
        line.setFieldValue(RegistroC170.ALIQ_ST, 123456.22);
        line.setFieldValue(RegistroC170.VL_ICMS_ST, 11447788552233669996.69);
        line.setFieldValue(RegistroC170.IND_APUR, "f");
        line.setFieldValue(RegistroC170.CST_IPI, "ff");
        line.setFieldValue(RegistroC170.COD_ENQ, " g ");
        line.setFieldValue(RegistroC170.VL_BC_IPI, 96396396385285274174112.32);
        line.setFieldValue(RegistroC170.ALIQ_IPI, 123456.33);
        line.setFieldValue(RegistroC170.VL_IPI, 12312345645678978998.66);
        line.setFieldValue(RegistroC170.CST_PIS, 22L);
        line.setFieldValue(RegistroC170.VL_BC_PIS, 12345678978945678978.66);
        line.setFieldValue(RegistroC170.ALIQ_PIS, 12345678.68);
        line.setFieldValue(RegistroC170.QUANT_BC_PIS, 12345678978912345674489.133);
        line.setFieldValue(RegistroC170.ALIQ_PIS_QUANT, 78945612312345678998.7894);
        line.setFieldValue(RegistroC170.VL_PIS, 123456456123123456123.33);
        line.setFieldValue(RegistroC170.CST_COFINS, 12L);
        line.setFieldValue(RegistroC170.VL_BC_COFINS, 12345678912345678945.33);
        line.setFieldValue(RegistroC170.ALIQ_COFINS, 78945612.2245);
        line.setFieldValue(RegistroC170.QUANT_BC_COFINS, 12378945612345678932.666);
        line.setFieldValue(RegistroC170.ALIQ_COFINS_QUANT, 12345678912345678978.3698);
        line.setFieldValue(RegistroC170.VL_COFINS, 12345678912345678978.66);
        line.setFieldValue(RegistroC170.COD_CTA, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

        StringBuffer a = line.getRepresentation();
        System.out.print(a);



    }
}
