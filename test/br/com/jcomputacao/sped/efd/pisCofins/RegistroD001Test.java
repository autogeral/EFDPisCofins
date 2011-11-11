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
public class RegistroD001Test {

    public RegistroD001Test() {
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
    public void RegistroD001Test() {
        RegistroD001 reg = new RegistroD001();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD001.REG, "0001");
        line.setFieldValue(RegistroD001.IND_MOV, "1");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
