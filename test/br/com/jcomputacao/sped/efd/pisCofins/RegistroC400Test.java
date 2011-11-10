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
 * 10/11/2011 19:33:42
 * @author John
 */
public class RegistroC400Test {

    public RegistroC400Test() {

        RegistroC400 reg = new RegistroC400();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroC400.REG, "C400");
        line.setFieldValue(RegistroC400.COD_MOD, "AA");
        line.setFieldValue(RegistroC400.ECF_MOD, "QWEQWEQWERQWEQWEQWER");
        line.setFieldValue(RegistroC400.ECF_FAB, "QWEQWEQWER");
        line.setFieldValue(RegistroC400.ECF_CX, 123L);
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
     * Test of getNome method, of class RegistroC400.
     */
    @Test
    public void testGetNome() {
    }
}
