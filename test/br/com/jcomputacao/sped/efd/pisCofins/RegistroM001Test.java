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
 * @author Ana Cláudia
 */
public class RegistroM001Test {
     public RegistroM001Test() {
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
    public void RegistroM001Test() {
        RegistroM001 reg = new RegistroM001();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroM001.REG, "0100");
        line.setFieldValue(RegistroM001.IND_MOV, "1");
            
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
    
}
