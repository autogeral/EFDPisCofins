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
public class RegistroC605Test {

    public RegistroC605Test() {
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
    public void RegistroC605Test() {
        RegistroC605 reg = new RegistroC605();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroC605.REG, "0001");
        line.setFieldValue(RegistroC605.CST_COFINS, 3L);
        line.setFieldValue(RegistroC605.VL_ITEM, 222.76);
        line.setFieldValue(RegistroC605.VL_BC_COFINS, 493.45);
        line.setFieldValue(RegistroC605.ALIQ_COFINS, 1111.4444);
        line.setFieldValue(RegistroC605.VL_COFINS, 234.34);
        line.setFieldValue(RegistroC605.COD_CTA, "aaaaaaaaaaaaa");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
