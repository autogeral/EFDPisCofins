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
 * 10/11/2011 19:00:47
 * @author John
 */
public class RegistroC395Test {

    public RegistroC395Test() throws ParseException {
        RegistroC395 reg = new RegistroC395();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");

        line.setFieldValue(RegistroC395.REG, "C395");
        line.setFieldValue(RegistroC395.COD_MOD, "AB");
        line.setFieldValue(RegistroC395.COD_PART, "QWERTYUIOPQWERTYUIOPQWERTYUIOPQWERTYUIOPQWERTYUIOPQWERTYUIOP");
        line.setFieldValue(RegistroC395.SER, "ABC");
        line.setFieldValue(RegistroC395.SUB_SER, "DFG");
        line.setFieldValue(RegistroC395.NUM_DOC, "ABCASD");
        line.setFieldValue(RegistroC395.DT_DOC, data);
        line.setFieldValue(RegistroC395.VL_DOC, 12345678901234567890.99);
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
     * Test of getNome method, of class RegistroC395.
     */
    @Test
    public void testGetNome() {
    }
}
