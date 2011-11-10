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
 * 10/11/2011 21:48:06
 * @author John
 */
public class RegistroC500Test {

    public RegistroC500Test() throws ParseException {
        RegistroC500 reg = new RegistroC500();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroC500.REG, "C500");
        line.setFieldValue(RegistroC500.COD_PART, "QASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTGQASWEDFRTG");
        line.setFieldValue(RegistroC500.COD_MOD, "AB");
        line.setFieldValue(RegistroC500.COD_SIT, 12L);
        line.setFieldValue(RegistroC500.SER, "ABCD");
        line.setFieldValue(RegistroC500.SUB, 123L);
        line.setFieldValue(RegistroC500.NUM_DOC, 123456789L);
        line.setFieldValue(RegistroC500.DT_DOC, data);
        line.setFieldValue(RegistroC500.DT_ENT, data);
        line.setFieldValue(RegistroC500.VL_DOC, 12345678912345678911.11);
        line.setFieldValue(RegistroC500.VL_ICMS, 12345678912345678911.11);
        line.setFieldValue(RegistroC500.COD_INF, "ABCDEFG");
        line.setFieldValue(RegistroC500.VL_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC500.VL_COFINS, 12345678912345678911.11);
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
     * Test of getNome method, of class RegistroC500.
     */
    @Test
    public void testGetNome() {
    }
}
