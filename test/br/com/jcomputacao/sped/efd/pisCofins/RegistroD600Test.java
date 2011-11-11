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
 *
 * @author Ana Cláudia
 */
public class RegistroD600Test {

    public RegistroD600Test() {
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
    public void RegistroD600Test() throws ParseException {
        RegistroD600 reg = new RegistroD600();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");

        line.setFieldValue(RegistroD600.REG, "0100");
        line.setFieldValue(RegistroD600.COD_MOD, "12");
        line.setFieldValue(RegistroD600.COD_MUN, 1234567L);
        line.setFieldValue(RegistroD600.SER, "3412");
        line.setFieldValue(RegistroD600.SUB, 123L);
        line.setFieldValue(RegistroD600.IND_REC, 1L);
        line.setFieldValue(RegistroD600.QTD_CONS, 1234567L);
        line.setFieldValue(RegistroD600.DT_DOC_INI, data);
        line.setFieldValue(RegistroD600.DT_DOC_FIN, data);
        line.setFieldValue(RegistroD600.VL_DOC, 12367.34);
        line.setFieldValue(RegistroD600.VL_DESC, 12367.34);
        line.setFieldValue(RegistroD600.VL_SERV, 12367.34);
        line.setFieldValue(RegistroD600.VL_SERV_NT, 12367.34);
        line.setFieldValue(RegistroD600.VL_TERC, 12367.34);
        line.setFieldValue(RegistroD600.VL_DA, 12367.34);
        line.setFieldValue(RegistroD600.VL_BC_ICMS, 12367.34);
        line.setFieldValue(RegistroD600.VL_ICMS, 12367.34);
        line.setFieldValue(RegistroD600.VL_PIS, 12367.34);
        line.setFieldValue(RegistroD600.VL_COFINS, 12367.34);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
