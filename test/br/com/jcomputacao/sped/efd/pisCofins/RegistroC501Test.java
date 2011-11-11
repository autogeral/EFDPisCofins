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
 * 10/11/2011 21:59:44
 * @author John
 */
public class RegistroC501Test {

    public RegistroC501Test() {
        RegistroC501 reg = new RegistroC501();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC501.REG, "C501");
        line.setFieldValue(RegistroC501.CST_PIS, 99L);
        line.setFieldValue(RegistroC501.VL_ITEM, 12345678912345678911.11);
        line.setFieldValue(RegistroC501.NAT_BC_CRED, "AB");
        line.setFieldValue(RegistroC501.VL_BC_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC501.ALIQ_PIS, 12345678.1111);
        line.setFieldValue(RegistroC501.VL_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC501.COD_CTA, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
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
     * Test of getNome method, of class RegistroC501.
     */
    @Test
    public void testGetNome() {
    }
}
