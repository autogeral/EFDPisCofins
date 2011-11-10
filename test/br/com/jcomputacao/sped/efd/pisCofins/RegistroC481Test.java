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
 * 10/11/2011 19:58:05
 * @author John
 */
public class RegistroC481Test {

    public RegistroC481Test() {
        RegistroC481 reg = new RegistroC481();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC481.REG, "C481");
        line.setFieldValue(RegistroC481.CST_PIS, 99L);
        line.setFieldValue(RegistroC481.VL_ITEM, 12345678912345678911.11);
        line.setFieldValue(RegistroC481.VL_BC_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC481.ALIQ_PIS, 12345678.9999);
        line.setFieldValue(RegistroC481.QUANT_BC_PIS, 12345678912345678911.111);
        line.setFieldValue(RegistroC481.ALIQ_PIS_QUANT, 12345678912345678911.11111);
        line.setFieldValue(RegistroC481.VL_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC481.COD_ITEM, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
        line.setFieldValue(RegistroC481.COD_CTA, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
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
     * Test of getNome method, of class RegistroC481.
     */
    @Test
    public void testGetNome() {
    }
}
