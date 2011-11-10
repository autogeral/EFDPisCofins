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
public class RegistroD201Test {

    public RegistroD201Test() {
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
    public void RegistroD201Test() {
        RegistroD201 reg = new RegistroD201();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD201.REG, "0100");
        line.setFieldValue(RegistroD201.CST_PIS, 41L);
        line.setFieldValue(RegistroD201.VL_ITEM, 124.76);
        line.setFieldValue(RegistroD201.VL_BC_PIS, 973.55);
        line.setFieldValue(RegistroD201.ALIQ_PIS, 12345678.1234);
        line.setFieldValue(RegistroD201.VL_PIS, 123.45);
        line.setFieldValue(RegistroD201.COD_CTA, "1234567DSAA8");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
