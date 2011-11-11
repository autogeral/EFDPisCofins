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
 * 10/11/2011 22:11:17
 * @author John
 */
public class RegistroC505Test {

    public RegistroC505Test() {
        RegistroC505 reg = new RegistroC505();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC505.REG, "C505");
        line.setFieldValue(RegistroC505.CST_COFINS, 99L);
        line.setFieldValue(RegistroC505.VL_ITEM, 12345678912345678911.11);
        line.setFieldValue(RegistroC505.NAT_BC_CRED, "AA");
        line.setFieldValue(RegistroC505.VL_BC_COFINS, 12345678912345678911.11);
        line.setFieldValue(RegistroC505.ALIQ_COFINS, 12345678.1111);
        line.setFieldValue(RegistroC505.VL_COFINS, 12345678912345678911.11);
        line.setFieldValue(RegistroC505.COD_CTA, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
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
     * Test of getNome method, of class RegistroC505.
     */
    @Test
    public void testGetNome() {
    }
}
