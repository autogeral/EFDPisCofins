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
 * 10/11/2011 20:39:42
 * @author John
 */
public class RegistroC491Test {

    public RegistroC491Test() {
        RegistroC491 reg = new RegistroC491();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC491.REG, "C491");
        line.setFieldValue(RegistroC491.COD_ITEM, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
        line.setFieldValue(RegistroC491.CST_PIS, 22L);
        line.setFieldValue(RegistroC491.CFOP, 1234L);
        line.setFieldValue(RegistroC491.VL_ITEM, 12345678912345678911.11);
        line.setFieldValue(RegistroC491.VL_BC_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC491.ALIQ_PIS, 12345678.1111);
        line.setFieldValue(RegistroC491.QUANT_BC_PIS, 12345678912345678911.111);
        line.setFieldValue(RegistroC491.ALIQ_PIS_QUANT, 12345678912345678911.1111);
        line.setFieldValue(RegistroC491.VL_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC491.COD_CTA, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");

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
     * Test of getNome method, of class RegistroC491.
     */
    @Test
    public void testGetNome() {
    }
}
