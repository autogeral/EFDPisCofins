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
 * 17/11/2011 20:00:21
 * @author rafael.galvao
 */
public class RegistroM600Test {
    
    public RegistroM600Test() {
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
     * Test of getNome method, of class RegistroM600.
     */
    @Test
    public void RegistroM610Test(){
        RegistroM600 rm = new RegistroM600();
        LineModel line = rm.createModel();
        
        line.setFieldValue(RegistroM600.REG, "1234");
        line.setFieldValue(RegistroM600.VL_TOT_CONT_NC_PER, 12304567890123456789.33);
        line.setFieldValue(RegistroM600.VL_TOT_CRED_DESC, 12345678912345678912.32);
        line.setFieldValue(RegistroM600.VL_TOT_CRED_DESC_ANT, 12345678901234567890.66);
        line.setFieldValue(RegistroM600.VL_TOT_CONT_NC_DEV, 12345678.1199);
        line.setFieldValue(RegistroM600.VL_RET_NC, 123456789012345678999.663);
        line.setFieldValue(RegistroM600.VL_OUT_DED_NC, 12345678912345678912.3212);
        line.setFieldValue(RegistroM600.VL_CONT_NC_REC, 12345678901234567890.66);
        line.setFieldValue(RegistroM600.VL_TOT_CONT_CUM_PER, 12345678901234567809.99);
        line.setFieldValue(RegistroM600.VL_RET_CUM, 123456789012345678999.66);
        line.setFieldValue(RegistroM600.VL_OUT_DED_CUM, 12345678912345678912.32);
        line.setFieldValue(RegistroM600.VL_CONT_CUM_REC, 12345678901234567890.66);
        line.setFieldValue(RegistroM600.VL_TOT_CONT_REC, 12345678901234567809.99);
     
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
