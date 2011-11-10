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
 * 10/11/2011 19:18:21
 * @author John
 */
public class RegistroC396Test {

    public RegistroC396Test() {
        RegistroC396 reg = new RegistroC396();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC396.REG, "C396");
        line.setFieldValue(RegistroC396.COD_ITEM,"QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
        line.setFieldValue(RegistroC396.VL_ITEM, 12345678901234567890.99);
        line.setFieldValue(RegistroC396.VL_DESC,12345678901234567890.99);
        line.setFieldValue(RegistroC396.NAT_BC_CRED,"AA");
        line.setFieldValue(RegistroC396.CST_PIS,12L);
        line.setFieldValue(RegistroC396.VL_BC_PIS,12345678901234567890.99);
        line.setFieldValue(RegistroC396.ALIQ_PIS,12345678.9999);
        line.setFieldValue(RegistroC396.VL_PIS,12345678901234567890.991);
        line.setFieldValue(RegistroC396.CST_COFINS,12L);
        line.setFieldValue(RegistroC396.VL_BC_COFINS,12345678901234567890.99);
        line.setFieldValue(RegistroC396.ALIQ_COFINS,12345678.9999);
        line.setFieldValue(RegistroC396.VL_COFINS,12345678901234567890.99);
        line.setFieldValue(RegistroC396.COD_CTA,"QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
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
     * Test of getNome method, of class RegistroC396.
     */
    @Test
    public void testGetNome() {
    }
}
