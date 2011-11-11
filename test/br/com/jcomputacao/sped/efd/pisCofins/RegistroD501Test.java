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
 *
 * @author Ana Cláudia
 */
public class RegistroD501Test {
     public RegistroD501Test() {
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

    @Test
    public void RegistroD501Test() {
        RegistroD501 reg = new RegistroD501();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD501.REG, "0100");
        line.setFieldValue(RegistroD501.CST_PIS, 34L);
        line.setFieldValue(RegistroD501.VL_ITEM, 302.23);
        line.setFieldValue(RegistroD501.NAT_BC_CRED, "WD");
        line.setFieldValue(RegistroD501.VL_BC_PIS, 30232.23);
        line.setFieldValue(RegistroD501.ALIQ_PIS, 12345302.1234);
        line.setFieldValue(RegistroD501.VL_PIS, 352.33);
        line.setFieldValue(RegistroD501.COD_CTA, "ASDASDDDD3023");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
