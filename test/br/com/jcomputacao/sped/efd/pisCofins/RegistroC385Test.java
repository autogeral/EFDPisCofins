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
 * 09/11/2011 21:54:20
 * @author John
 */
public class RegistroC385Test {
    
    public RegistroC385Test() {
        RegistroC385 reg = new RegistroC385();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC385.REG, "0001");
        line.setFieldValue(RegistroC385.CST_COFINS, 45L);
        line.setFieldValue(RegistroC385.COD_ITEM, "QQQQQWWWWWQQQQQWWWWWQQQQQWWWWWQQQQQWWWWWQQQQQWWWWWQQQQQWWWWW");
        line.setFieldValue(RegistroC385.VL_ITEM, 12345678901234567890.99);
        line.setFieldValue(RegistroC385.VL_BC_COFINS, 12345678901234567890.99);
        line.setFieldValue(RegistroC385.ALIQ_COFINS, 12345678.1234);
        line.setFieldValue(RegistroC385.QUANT_BC_COFINS, 12345678912345678911.111);
        line.setFieldValue(RegistroC385.ALIQ_COFINS_QUANT, 12345678912345678911.1221);
        line.setFieldValue(RegistroC385.VL_COFINS, 12345678912345678911.21);
        line.setFieldValue(RegistroC385.COD_CTA, "QQQQQWWWWWQQQQQWWWWWQQQQQWWWWWQQQQQWWWWWQQQQQWWWWWQQQQQWWWWW");

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
     * Test of getNome method, of class RegistroC385.
     */
    @Test
    public void testGetNome() {
    }
}
