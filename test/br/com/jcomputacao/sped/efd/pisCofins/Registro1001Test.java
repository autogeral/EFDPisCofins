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
 * 12/11/2011 10:37:55
 * @author WILL
 */
public class Registro1001Test {
        public Registro1001Test() {
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
    public void Registro1001Test(){
        Registro1001 reg = new Registro1001();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro1001.REG, "1234");
        line.setFieldValue(Registro1001.IND_MOV,1L);
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
}
