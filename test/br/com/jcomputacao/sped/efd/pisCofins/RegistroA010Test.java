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
 * 09/11/2011 19:33:43
 * @author Jonas
 */
public class RegistroA010Test {
    
     public RegistroA010Test(){
        
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
    public void registroA010test(){
        RegistroA010 reg = new RegistroA010();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroA010.REG, "0001");
        line.setFieldValue(RegistroA010.CNPJ, 12345678910123l);
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
