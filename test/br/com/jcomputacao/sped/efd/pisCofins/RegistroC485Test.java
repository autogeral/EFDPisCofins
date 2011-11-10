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
 * 10/11/2011 20:14:29
 * @author John
 */
public class RegistroC485Test {

    public RegistroC485Test() {
        RegistroC485 reg = new RegistroC485();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC485.REG, "C485");
        line.setFieldValue(RegistroC485.CST_COFINS, 99L);
        line.setFieldValue(RegistroC485.VL_ITEM, 12345678912345678911.11);
        line.setFieldValue(RegistroC485.VL_BC_COFINS, 12345678912345678911.11);
        line.setFieldValue(RegistroC485.ALIQ_COFINS, 12345678.9999);
        line.setFieldValue(RegistroC485.QUANT_BC_COFINS, 12345678912345678911.111);
        line.setFieldValue(RegistroC485.ALIQ_COFINS_QUANT, 12345678912345678911.1111);
        line.setFieldValue(RegistroC485.VL_COFINS, 12345678912345678911.11);
        line.setFieldValue(RegistroC485.COD_ITEM, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
        line.setFieldValue(RegistroC485.COD_CTA, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
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
     * Test of getNome method, of class RegistroC485.
     */
    @Test
    public void testGetNome() {
    }
}
