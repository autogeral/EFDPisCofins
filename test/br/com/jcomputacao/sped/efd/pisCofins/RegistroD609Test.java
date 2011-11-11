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
public class RegistroD609Test {
       public RegistroD609Test() {
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
    public void RegistroD609Test() {
        RegistroD609 reg = new RegistroD609();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD609.REG, "0100");
        line.setFieldValue(RegistroD609.NUM_PROC, "1234567891234567890");
        line.setFieldValue(RegistroD609.IND_PROC, "1");
     
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
