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
 * 12/11/2011 11:03:29
 * @author rafael.galvao
 */
public class RegistroC198Test extends Randomize {
    
    public RegistroC198Test() {
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
     * Test of getNome method, of class RegistroC198.
     */
    @Test
    public void RegistroC198Test(){
        RegistroC198 reg = new RegistroC198();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC198.REG, "1234");
        line.setFieldValue(RegistroC198.NUM_PROC, GeraStringRandom(20));
        line.setFieldValue(RegistroC198.IND_PROC, "f");
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
    }
}
