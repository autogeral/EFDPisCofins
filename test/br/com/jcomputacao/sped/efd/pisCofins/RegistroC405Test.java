/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 10/11/2011 19:45:52
 * @author John
 */
public class RegistroC405Test {

    public RegistroC405Test() throws ParseException {
        RegistroC405 reg = new RegistroC405();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroC405.REG, "C405");
        line.setFieldValue(RegistroC405.DT_DOC, data);
        line.setFieldValue(RegistroC405.CRO, 123l);
        line.setFieldValue(RegistroC405.CRZ, 123456l);
        line.setFieldValue(RegistroC405.NUM_COO_FIN, 123456l);
        line.setFieldValue(RegistroC405.GT_FIN, 12345678912345678911.11);
        line.setFieldValue(RegistroC405.VL_BRT, 12345678912345678911.11);

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
     * Test of getNome method, of class RegistroC405.
     */
    @Test
    public void testGetNome() {
    }
}
