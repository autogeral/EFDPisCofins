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

/**
 *
 * @author rafael.galvao
 */
public class RegistroC001Test {
    
    public RegistroC001Test() {
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

    @Test
    public void RegistroC001Test(){
        RegistroC001 reg = new RegistroC001();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC001.REG, "0001");
        line.setFieldValue(RegistroC001.IND_MOV, "l");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
