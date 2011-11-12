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
 * 12/11/2011 12:25:12
 * @author rafael.galvao
 */
public class RegistroM630Test {

    public RegistroM630Test() {
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
     * Test of getNome method, of class RegistroM630.
     */
    @Test
    public void RegistroM630Test() {
        RegistroM630 reg = new RegistroM630();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroM630.REG, "1234");
        line.setFieldValue(RegistroM630.CNPJ, 12345678912345L);
        line.setFieldValue(RegistroM630.VL_VEND, 123456789123456789.22);
        line.setFieldValue(RegistroM630.VL_NAO_RECEB, 123456789123456789.22);
        line.setFieldValue(RegistroM630.VL_CONT_DIF, 123456789123456789.22);
        line.setFieldValue(RegistroM630.VL_CRED_DIF, 123456789123456789.22);
        line.setFieldValue(RegistroM630.COD_CRED, "123");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);






    }
}
