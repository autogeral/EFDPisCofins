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
import static org.junit.Assert.*;

/**
 * 17/11/2011 20:41:06
 * @author rafael.galvao
 */
public class RegistroM500Test {
    
    public RegistroM500Test() {
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

    /**
     * Test of getNome method, of class RegistroM500.
     */
    @Test
    public void RegistroM500Test() {
        RegistroM500 reg = new RegistroM500();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroM500.REG, "0100");
        line.setFieldValue(RegistroM500.COD_CRED, "120");
        line.setFieldValue(RegistroM500.IND_CRED_ORI, 1L);
        line.setFieldValue(RegistroM500.VL_BC_COFINS, 12345678912345678912.54);
        line.setFieldValue(RegistroM500.ALIQ_COFINS, 12345678.1234);
        line.setFieldValue(RegistroM500.QUANT_BC_COFINS, 12345678978945612312.456);
        line.setFieldValue(RegistroM500.ALIQ_COFINS_QUANT, 12345678912345678912.1254);
        line.setFieldValue(RegistroM500.VL_CRED, 12345678912345678912.54);
        line.setFieldValue(RegistroM500.VL_AJUS_ACRES, 12345678978945612312.56);
        line.setFieldValue(RegistroM500.VL_AJUS_REDUC, 12345678912345678912.54);
        line.setFieldValue(RegistroM500.VL_CRED_DIFER, 12345678912345678912.54);
        line.setFieldValue(RegistroM500.VL_CRED_DISP, 12345678978945612312.45);
        line.setFieldValue(RegistroM500.IND_DESC_CRED, "a");
        line.setFieldValue(RegistroM500.VL_CRED_DESC, 12345678912345678912.54);
        line.setFieldValue(RegistroM500.SLD_CRED, 12345678912345678912.54);
     
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
