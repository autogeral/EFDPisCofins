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
 * 12/11/2011 11:39:12
 * @author rafael.galvao
 */
public class RegistroM810Test extends Randomize{
    
    public RegistroM810Test() {
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
     * Test of getNome method, of class RegistroM810.
     */
    @Test
    public void RegistroM810Test(){
        RegistroM810 reg = new RegistroM810();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroM810.REG, "1234");
        line.setFieldValue(RegistroM810.NAT_REC, "823");
        line.setFieldValue(RegistroM810.VL_REC, 1234567489123456789.32);
        line.setFieldValue(RegistroM810.COD_CTA, GeraStringRandom(60));
        line.setFieldValue(RegistroM810.DESC_COMPL, GeraStringRandom(255));
          StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
        
        
        
    }
}
