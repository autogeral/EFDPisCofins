/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.sped.efd.COFINSCofins.RegistroD605;
import br.com.jcomputacao.sped.efd.COFINSCofins.RegistroD605;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD605Test {
        public RegistroD605Test() {
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
    public void RegistroD605Test() {
        RegistroD605 reg = new RegistroD605();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD605.REG, "0100");
        line.setFieldValue(RegistroD605.COD_CLASS, 1234L);
        line.setFieldValue(RegistroD605.VL_ITEM, 1432.12);
        line.setFieldValue(RegistroD605.VL_DESC, 1234.53);
        line.setFieldValue(RegistroD605.CST_COFINS, 14L);
        line.setFieldValue(RegistroD605.VL_BC_COFINS, 1234.64);
        line.setFieldValue(RegistroD605.ALIQ_COFINS, 14321234.1234);
        line.setFieldValue(RegistroD605.VL_COFINS, 1234.34);
        line.setFieldValue(RegistroD605.COD_CTA, "SF3242FDSAS");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
