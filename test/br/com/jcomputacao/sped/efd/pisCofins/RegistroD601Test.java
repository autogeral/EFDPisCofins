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
public class RegistroD601Test {

    public RegistroD601Test() {
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
    public void RegistroD601Test() {
        RegistroD601 reg = new RegistroD601();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD601.REG, "0100");
        line.setFieldValue(RegistroD601.COD_CLASS, 1234L);
        line.setFieldValue(RegistroD601.VL_ITEM, 1432.12);
        line.setFieldValue(RegistroD601.VL_DESC, 1234.53);
        line.setFieldValue(RegistroD601.CST_PIS, 14L);
        line.setFieldValue(RegistroD601.VL_BC_PIS, 1234.64);
        line.setFieldValue(RegistroD601.ALIQ_PIS, 14321234.1234);
        line.setFieldValue(RegistroD601.VL_PIS, 1234.34);
        line.setFieldValue(RegistroD601.COD_CTA, "SF3242FDSAS");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
