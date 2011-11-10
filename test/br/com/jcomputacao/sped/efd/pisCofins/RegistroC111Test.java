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
 * 09/11/2011 21:59:37
 * @author rafael.galvao
 */
public class RegistroC111Test {
    
    public RegistroC111Test() {
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
    public void RegistroC111Tes(){
        RegistroC111 reg = new RegistroC111();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC111.REG, "0001");
        line.setFieldValue(RegistroC111.NUM_PROC, " rafaelalexandredeo  ");
        line.setFieldValue(RegistroC111.IND_PROC, "a");
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
