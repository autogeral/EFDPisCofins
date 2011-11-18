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
 * 17/11/2011 22:18:41
 * @author rafael.galvao
 */
public class RegistroM350Test {
    
    public RegistroM350Test() {
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
     * Test of getNome method, of class RegistroM350.
     */
    @Test
    public void RegistroM350Test() {
        RegistroM350 reg = new RegistroM350();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroM350.REG, "0100");
        line.setFieldValue(RegistroM350.VL_TOT_FOL, 12345678912345678912.33);
        line.setFieldValue(RegistroM350.VL_EXC_BC, 12345678912345678912.33);
        line.setFieldValue(RegistroM350.VL_TOT_BC, 12345678912345678912.33);
        line.setFieldValue(RegistroM350.ALIQ_PIS_FOL, 123456.33);
        line.setFieldValue(RegistroM350.VL_TOT_CONT_FOL, 12345678912345678912.33);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
