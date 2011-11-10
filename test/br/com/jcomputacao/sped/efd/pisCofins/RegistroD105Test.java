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
public class RegistroD105Test {

    public RegistroD105Test() {
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
    public void RegistroD105Test() {
        RegistroD105 reg = new RegistroD105();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD105.REG, "0100");
        line.setFieldValue(RegistroD105.IND_NAT_FRT, "1");
        line.setFieldValue(RegistroD105.VL_ITEM, 123.98);
        line.setFieldValue(RegistroD105.CST_COFINS, 12L);
        line.setFieldValue(RegistroD105.NAT_BC_CRED, "12");
        line.setFieldValue(RegistroD105.VL_BC_COFINS, 95.65);
        line.setFieldValue(RegistroD105.ALIQ_COFINS, 12345678.7654);
        line.setFieldValue(RegistroD105.VL_COFINS, 123.98);
        line.setFieldValue(RegistroD105.COD_CTA, "12Ldsadsa2q");




        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
