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
 * 12/11/2011 09:51:37
 * @author WILL
 */
public class Registro9001Test {
        public Registro9001Test() {
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
    public void registro9001test(){
        Registro9001 reg = new Registro9001();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro9001.REG, "9001");
        line.setFieldValue(Registro9001.IND_MOV, 1l);
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }

    
}
