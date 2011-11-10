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
public class RegistroD111Test {

    public RegistroD111Test() {
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
    public void RegistroD111Test() {
        RegistroD111 reg = new RegistroD111();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD111.REG, "0100");
        line.setFieldValue(RegistroD111.NUM_PROC, "123456789012345678990");
        line.setFieldValue(RegistroD111.IND_PROC, "1");
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
