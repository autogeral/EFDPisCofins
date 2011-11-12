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
import static org.junit.Assert.*;

/**
 * 12/11/2011 11:49:23
 * @author rafael.galvao
 */
public class RegistroM800Test extends Randomize {

    public RegistroM800Test() {
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
     * Test of getNome method, of class RegistroM800.
     */
    @Test
    public void RegistroM800Test() {
        RegistroM800 reg = new RegistroM800();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroM800.REG, "1234");
        line.setFieldValue(RegistroM800.CST_COFINS, "98");
        line.setFieldValue(RegistroM800.VL_TOT_REC, 123456789123456789.36);
        line.setFieldValue(RegistroM800.COD_CTA, GeraStringRandom(60));
        line.setFieldValue(RegistroM800.DESC_COMPL, GeraStringRandom(255));
        StringBuffer a = line.getRepresentation();
        System.out.print(a);





    }
}
