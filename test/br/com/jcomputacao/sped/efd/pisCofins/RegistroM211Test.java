/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 21/11/2011 19:06:25
 * @author rafael.galvao
 */
public class RegistroM211Test {
    
    public RegistroM211Test() {
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
     * Test of getNome method, of class RegistroM211.
     */
    @Test
    public void RegistroM211Test() throws ParseException {
        RegistroM211 reg = new RegistroM211();
        LineModel line = reg.createModel();
     
                
        line.setFieldValue(RegistroM211.REG, "0100");
        line.setFieldValue(RegistroM211.IND_TIP_COOP, 12L);
        line.setFieldValue(RegistroM211.VL_BC_CONT_ANT_EXC_COOP, 2312132.45);
        line.setFieldValue(RegistroM211.VL_EXC_COOP_GER, 15612348987456.32);        
        line.setFieldValue(RegistroM211.VL_EXC_ESP_COOP, 12346123456456.66);
        line.setFieldValue(RegistroM211.VL_BC_CONT, 123456789456123.32);
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
