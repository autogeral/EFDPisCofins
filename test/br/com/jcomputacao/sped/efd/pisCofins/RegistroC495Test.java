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
 * 10/11/2011 21:24:01
 * @author John
 */
public class RegistroC495Test {

    public RegistroC495Test() {
        RegistroC495 reg = new RegistroC495();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC495.REG, "C495");
        line.setFieldValue(RegistroC495.COD_ITEM, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
        line.setFieldValue(RegistroC495.CST_COFINS, 22L);
        line.setFieldValue(RegistroC495.CFOP, 1234L);
        line.setFieldValue(RegistroC495.VL_ITEM, 12345678912345678911.11);
        line.setFieldValue(RegistroC495.VL_BC_COFINS, 12345678912345678911.11);
        line.setFieldValue(RegistroC495.ALIQ_COFINS, 12345678.1122);
        line.setFieldValue(RegistroC495.QUANT_BC_COFINS, 12345678912345678911.111);
        line.setFieldValue(RegistroC495.ALIQ_COFINS_QUANT, 12345678912345678911.1111);
        line.setFieldValue(RegistroC495.VL_COFINS, 12345678912345678911.11);
        line.setFieldValue(RegistroC495.COD_CTA, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
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
     * Test of getNome method, of class RegistroC495.
     */
    @Test
    public void testGetNome() {
    }
}
