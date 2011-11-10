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
 * 10/11/2011 21:34:15
 * @author John
 */
public class RegistroC499Test {

    public RegistroC499Test() {
        RegistroC499 reg = new RegistroC499();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC499.REG, "C499");
        line.setFieldValue(RegistroC499.NUM_PROC, "QWERTYUIOPASDFGHJKLO");
        line.setFieldValue(RegistroC499.IND_PROC, "A");

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
     * Test of getNome method, of class RegistroC499.
     */
    @Test
    public void testGetNome() {
    }
}
