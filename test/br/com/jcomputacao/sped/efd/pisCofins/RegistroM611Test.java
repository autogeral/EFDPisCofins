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
 * 17/11/2011 19:32:27
 * @author rafael.galvao
 */
public class RegistroM611Test {
    
    public RegistroM611Test() {
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
     * Test of getNome method, of class RegistroM611.
     */
    @Test
    public void RegistroM611Test(){
        RegistroM611 rm = new RegistroM611();
        LineModel line = rm.createModel();
        
        line.setFieldValue(RegistroM611.REG, "1234");
        line.setFieldValue(RegistroM611.IND_TIP_COOP, 21L);
        line.setFieldValue(RegistroM611.VL_BC_CONT_ANT_EXC_COOP, 12345678912345678912.32);
        line.setFieldValue(RegistroM611.VL_EXC_COOP_GER, 12345678901234567890.66);
        line.setFieldValue(RegistroM611.VL_EXC_ESP_COOP, 12345678901234567809.99);
        line.setFieldValue(RegistroM611.VL_BC_CONT, 123456789012345678999.66);
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
