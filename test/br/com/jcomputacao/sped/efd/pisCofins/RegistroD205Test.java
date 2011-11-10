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
public class RegistroD205Test {

    public RegistroD205Test() {
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
    public void RegistroD205Test() {
        RegistroD205 reg = new RegistroD205();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD205.REG, "0100");
        line.setFieldValue(RegistroD205.CST_COFINS, 41L);
        line.setFieldValue(RegistroD205.VL_ITEM, 124.76);
        line.setFieldValue(RegistroD205.VL_BC_COFINS, 973.55);
        line.setFieldValue(RegistroD205.ALIQ_COFINS, 12345678.1234);
        line.setFieldValue(RegistroD205.VL_COFINS, 123.45);
        line.setFieldValue(RegistroD205.COD_CTA, "1234567DSAA8");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
