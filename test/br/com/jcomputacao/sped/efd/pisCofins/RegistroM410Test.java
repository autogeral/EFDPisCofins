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
 * 17/11/2011 21:20:32
 * @author rafael.galvao
 */
public class RegistroM410Test extends Randomize{

    public RegistroM410Test() {
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
     * Test of getNome method, of class RegistroM410.
     */
    @Test
    public void RegistroM410Test() {
        RegistroM410 reg = new RegistroM410();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroM410.REG, "0100");
        line.setFieldValue(RegistroM410.NAT_REC, "120");
        line.setFieldValue(RegistroM410.VL_REC, 12D);
        line.setFieldValue(RegistroM410.COD_CTA, GeraStringRandom(60));
        line.setFieldValue(RegistroM410.DESC_COMPL, GeraStringRandom(255));

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
