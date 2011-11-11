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
 * 10/11/2011 22:37:53
 * @author John
 */
public class RegistroC600Test {

    public RegistroC600Test() throws ParseException {
        RegistroC600 reg = new RegistroC600();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroC600.REG, "C600");
        line.setFieldValue(RegistroC600.COD_MOD, "AA");
        line.setFieldValue(RegistroC600.COD_MUN, 1234567L);
        line.setFieldValue(RegistroC600.SER, "ABCD");
        line.setFieldValue(RegistroC600.SUB, 123L);
        line.setFieldValue(RegistroC600.COD_CONS, 99L);
        line.setFieldValue(RegistroC600.QTD_CONS, 1234567891234567891L);
        line.setFieldValue(RegistroC600.QTD_CANC, 1234567891234567891L);
        line.setFieldValue(RegistroC600.DT_DOC, data);
        line.setFieldValue(RegistroC600.VL_DOC, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_DESC, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.CONS, 1234567891234567891l);
        line.setFieldValue(RegistroC600.VL_FORN, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_SERV_NT, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_TERC, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_DA, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_BC_ICMS, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_ICMS, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_BC_ICMS_ST, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_ICMS_ST, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_PIS, 12345678912345678911.11);
        line.setFieldValue(RegistroC600.VL_COFINS, 12345678912345678911.11);
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
     * Test of getNome method, of class RegistroC600.
     */
    @Test
    public void testGetNome() {
    }
}
