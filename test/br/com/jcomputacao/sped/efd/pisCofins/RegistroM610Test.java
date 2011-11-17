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
 * 17/11/2011 19:48:23
 * @author rafael.galvao
 */
public class RegistroM610Test {
    
    public RegistroM610Test() {
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
     * Test of getNome method, of class RegistroM610.
     */
    @Test
    public void RegistroM610Test(){
        RegistroM610 rm = new RegistroM610();
        LineModel line = rm.createModel();
        
        line.setFieldValue(RegistroM610.REG, "1234");
        line.setFieldValue(RegistroM610.COD_CONT, "12");
        line.setFieldValue(RegistroM610.VL_REC_BRT, 12345678912345678912.32);
        line.setFieldValue(RegistroM610.VL_BC_CONT, 12345678901234567890.66);
        line.setFieldValue(RegistroM610.ALIQ_COFINS, 12345678.1199);
        line.setFieldValue(RegistroM610.QUANT_BC_COFINS, 123456789012345678999.663);
        line.setFieldValue(RegistroM610.ALIQ_COFINS_QUANT, 12345678912345678912.3212);
        line.setFieldValue(RegistroM610.VL_CONT_APUR, 12345678901234567890.66);
        line.setFieldValue(RegistroM610.VL_AJUS_ACRES, 12345678901234567809.99);
        line.setFieldValue(RegistroM610.VL_AJUS_REDUC, 123456789012345678999.66);
        line.setFieldValue(RegistroM610.VL_CONT_DIFER, 12345678912345678912.32);
        line.setFieldValue(RegistroM610.VL_CONT_DIFER_ANT, 12345678901234567890.66);
        line.setFieldValue(RegistroM610.VL_CONT_PER, 12345678901234567809.99);
     
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
