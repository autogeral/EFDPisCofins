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
 * 09/11/2011 08:23:46
 * @author WILL
 */
public class Registro0001Test {
    public Registro0001Test() {
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
    public void registro0001test(){
        Registro0001 reg = new Registro0001();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0001.REG, "0001");
        line.setFieldValue(Registro0001.IND_MOV, "0");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }

    
}
