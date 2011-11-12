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
 * 12/11/2011 11:15:04
 * @author rafael.galvao
 */
public class RegistroC199Test {
    
    public RegistroC199Test() {
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
     * Test of getNome method, of class RegistroC199.
     */
    @Test
    public void RegistroC199Test(){
        RegistroC199 reg = new RegistroC199();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC199.REG, "1234");
        line.setFieldValue(RegistroC199.COD_DOC_IMP, "1");
        line.setFieldValue(RegistroC199.NUM_DOC_IMP, "123457897");
        line.setFieldValue(RegistroC199.VL_PIS_IMP, 123456789123456789.32);
        line.setFieldValue(RegistroC199.VL_COFINS_IMP, 123456789123456789.32);
        line.setFieldValue(RegistroC199.NUM_ACDRAW, " asdfghjklçpoiuytrew");
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
                
        
        
        
    }
}
