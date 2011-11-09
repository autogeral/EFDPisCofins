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
 * 09/11/2011 11:06:06
 * @author WILL
 */
public class Registro0190Test {
            public Registro0190Test() {
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
    public void registro0190test(){
        Registro0190 reg = new Registro0190();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0190.REG, "0001");
        line.setFieldValue(Registro0190.UNID, "111111");
        line.setFieldValue(Registro0190.DESCR, "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");

        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
    
}
