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
 * 17/11/2011 20:22:09
 * @author rafael.galvao
 */
public class RegistroM505Test extends Randomize{
    
    public RegistroM505Test() {
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
     * Test of getNome method, of class RegistroM505.
     */
    @Test
    public void RegistroM505Test(){
        RegistroM505 rm = new RegistroM505();
        LineModel line = rm.createModel();
        
        line.setFieldValue(RegistroM505.REG, "1234");
        line.setFieldValue(RegistroM505.NAT_BC_CRED, "22");
        line.setFieldValue(RegistroM505.CST_COFINS, 32L);
        line.setFieldValue(RegistroM505.VL_BC_COFINS_TOT, 12345678912345678912.32);
        line.setFieldValue(RegistroM505.VL_BC_COFINS_CUM, 12345678912345678912.32);
        line.setFieldValue(RegistroM505.VL_BC_COFINS_NC, 12345678912345678912.32);
        line.setFieldValue(RegistroM505.VL_BC_COFINS, 12345678912345678912.32);
        line.setFieldValue(RegistroM505.QUANT_BC_COFINS_TOT, 12345678912345678912.322);
        line.setFieldValue(RegistroM505.QUANT_BC_COFINS, 12345678912345678912.322);
        line.setFieldValue(RegistroM505.DESC_CRED, GeraStringRandom(60));
     
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
