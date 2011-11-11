/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.sped.efd.COFINSCofins.RegistroD505;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD505Test {
    public RegistroD505Test() {
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
    public void RegistroD505Test() {
        RegistroD505 reg = new RegistroD505();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD505.REG, "0100");
        line.setFieldValue(RegistroD505.CST_COFINS, 34L);
        line.setFieldValue(RegistroD505.VL_ITEM, 302.23);
        line.setFieldValue(RegistroD505.NAT_BC_CRED, "WD");
        line.setFieldValue(RegistroD505.VL_BC_COFINS, 30232.23);
        line.setFieldValue(RegistroD505.ALIQ_COFINS, 12345302.1234);
        line.setFieldValue(RegistroD505.VL_COFINS, 352.33);
        line.setFieldValue(RegistroD505.COD_CTA, "ASDASDDDD30223");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
