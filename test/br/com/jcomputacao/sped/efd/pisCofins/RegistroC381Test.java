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
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class RegistroC381Test {
    
    public RegistroC381Test() {
        RegistroC381 reg = new RegistroC381();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC381.REG, "0001");
        line.setFieldValue(RegistroC381.CST_PIS, 11L);
        line.setFieldValue(RegistroC381.COD_ITEM, "ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE");
        line.setFieldValue(RegistroC381.VL_ITEM, 12345678901234567890.55);
        line.setFieldValue(RegistroC381.VL_BC_PIS, 12345678901234567890.55);
        line.setFieldValue(RegistroC381.ALIQ_PIS, 12345678.99);
        line.setFieldValue(RegistroC381.QUANT_BC_PIS, 12345678912345678911.113);
        line.setFieldValue(RegistroC381.ALIQ_PIS_QUANT, 12345678912345678911.1133);
        line.setFieldValue(RegistroC381.VL_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC381.COD_CTA, "ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE");

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
     * Test of getNome method, of class RegistroC381.
     */
    @Test
    public void testGetNome() {
    }
}
