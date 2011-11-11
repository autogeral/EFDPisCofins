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
public class RegistroD990Test {
      public RegistroD990Test() {
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
    public void RegistroD990Test() {
        RegistroD990 reg = new RegistroD990();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD990.REG, "0100");
        line.setFieldValue(RegistroD990.QTD_LIN_D, 12345678L);
            
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
