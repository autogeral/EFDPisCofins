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
 * 10/11/2011 20:23:46
 * @author John
 */
public class RegistroC489Test {

    public RegistroC489Test() {
        RegistroC489 reg = new RegistroC489();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC489.REG, "C489");
        line.setFieldValue(RegistroC489.NUM_PROC, "AAAAABBBBBAAAAABBBBB");
        line.setFieldValue(RegistroC489.IND_PROC, "K");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
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

    /**
     * Test of getNome method, of class RegistroC489.
     */
    @Test
    public void testGetNome() {
    }
}
