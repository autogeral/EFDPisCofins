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
 * 10/11/2011 22:18:36
 * @author John
 */
public class RegistroC509Test {

    public RegistroC509Test() {
        RegistroC509 reg = new RegistroC509();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC509.REG, "C509");
        line.setFieldValue(RegistroC509.NUM_PROC, "QWERTQWERTQWERTQWERT");
        line.setFieldValue(RegistroC509.IND_PROC, "A");
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
     * Test of getNome method, of class RegistroC509.
     */
    @Test
    public void testGetNome() {
    }
}
