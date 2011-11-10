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
public class RegistroD209Test {
     public RegistroD209Test() {
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
    public void RegistroD209Test() {
        RegistroD209 reg = new RegistroD209();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD209.REG, "0100");
        line.setFieldValue(RegistroD209.NUM_PROC, "1234567891234567890");
        line.setFieldValue(RegistroD209.IND_PROC, "1");
     
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
