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
public class RegistroC609Test {

    public RegistroC609Test() {
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
    public void RegistroC609Test() {
        RegistroC609 reg = new RegistroC609();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroC609.REG, "0001");
        line.setFieldValue(RegistroC609.NUM_PROC, "12879332");
        line.setFieldValue(RegistroC609.IND_PROC, "1");


        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
