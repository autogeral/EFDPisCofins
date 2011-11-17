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
 * 17/11/2011 21:36:53
 * @author rafael.galvao
 */
public class RegistroM400Test extends Randomize {
    
    public RegistroM400Test() {
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
     * Test of getNome method, of class RegistroM400.
     */
    @Test
    public void RegistroM400Test() {
        RegistroM400 reg = new RegistroM400();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroM400.REG, "0100");
        line.setFieldValue(RegistroM400.CST_PIS, "12");
        line.setFieldValue(RegistroM400.VL_TOT_REC, 12345678912345678912.33);
        line.setFieldValue(RegistroM400.COD_CTA, GeraStringRandom(60));
        line.setFieldValue(RegistroM400.DESC_COMPL, GeraStringRandom(255));

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
