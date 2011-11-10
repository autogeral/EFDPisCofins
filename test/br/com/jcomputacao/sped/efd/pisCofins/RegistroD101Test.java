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
public class RegistroD101Test {

    public RegistroD101Test() {
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
    public void RegistroD101Test() {
        RegistroD101 reg = new RegistroD101();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD101.REG, "0100");
        line.setFieldValue(RegistroD101.IND_NAT_FRT, "1");
        line.setFieldValue(RegistroD101.VL_ITEM, 123.98);
        line.setFieldValue(RegistroD101.CST_PIS, 12L);
        line.setFieldValue(RegistroD101.NAT_BC_CRED, "12");
        line.setFieldValue(RegistroD101.VL_BC_PIS, 95.65);
        line.setFieldValue(RegistroD101.ALIQ_PIS, 12345678.7654);
        line.setFieldValue(RegistroD101.VL_PIS, 123.98);
        line.setFieldValue(RegistroD101.COD_CTA, "12Ldsadsa2q");




        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
