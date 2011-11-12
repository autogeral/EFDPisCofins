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
 * 12/11/2011 11:30:29
 * @author rafael.galvao
 */
public class RegistroM990Test {
    
    public RegistroM990Test() {
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
     * Test of getNome method, of class RegistroM990.
     */
    @Test
    public void RegistroM990Test(){
        RegistroM990 reg = new RegistroM990();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroM990.REG, "1234");
        line.setFieldValue(RegistroM990.QTD_LIN_M, 1234567891234567891l);
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
        
        
    }
}
