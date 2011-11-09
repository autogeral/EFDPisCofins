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
 * 09/11/2011 19:23:23
 * @author Jonas
 */
public class RegistroA001Test {
    
    public RegistroA001Test(){
        
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
    public void registroA001test(){
        
         RegistroA001 reg = new RegistroA001();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroA001.REG, "0001");
        line.setFieldValue(RegistroA001.IND_MOV, "0");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
    
}
