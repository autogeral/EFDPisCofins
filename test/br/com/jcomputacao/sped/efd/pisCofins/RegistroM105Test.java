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
public class RegistroM105Test {
       public RegistroM105Test() {
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
    public void RegistroM105Test() {
        RegistroM105 reg = new RegistroM105();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroM105.REG, "0100");
        line.setFieldValue(RegistroM105.NAT_BC_CRED, "12");
        line.setFieldValue(RegistroM105.CST_PIS, 31L);
        line.setFieldValue(RegistroM105.VL_BC_PIS_TOT, 123.34);
        line.setFieldValue(RegistroM105.VL_BC_PIS_CUM, 165.34);
        line.setFieldValue(RegistroM105.VL_BC_PIS_NC, 321.34);
        line.setFieldValue(RegistroM105.VL_BC_PIS, 123.34);
        line.setFieldValue(RegistroM105.QUANT_BC_PIS_TOT, 123.324);
        line.setFieldValue(RegistroM105.QUANT_BC_PIS, 123.334);
        line.setFieldValue(RegistroM105.DESC_CRED, "dasdqwasd");
              
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
