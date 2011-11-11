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
public class RegistroD100Test {

    public RegistroD100Test() {
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
    public void RegistroD100Test() throws ParseException {
        RegistroD100 reg = new RegistroD100();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("05102010");

        line.setFieldValue(RegistroD100.REG, "0100");
        line.setFieldValue(RegistroD100.IND_OPER, "1");
        line.setFieldValue(RegistroD100.IND_EMIT, "1");
        line.setFieldValue(RegistroD100.COD_PART, "codigo00001ds");
        line.setFieldValue(RegistroD100.COD_MOD, "12");
        line.setFieldValue(RegistroD100.COD_SIT, 21L);
        line.setFieldValue(RegistroD100.SER, "1234");
        line.setFieldValue(RegistroD100.SUB, "123");
        line.setFieldValue(RegistroD100.NUM_DOC, 123456789L);
        line.setFieldValue(RegistroD100.CHV_CTE, 6654564654L);
        line.setFieldValue(RegistroD100.DT_DOC, data);
        line.setFieldValue(RegistroD100.DT_A_P, data);
        line.setFieldValue(RegistroD100.TP_CTe, 3L);
        line.setFieldValue(RegistroD100.CHV_CTE_REF, 324324234L);
        line.setFieldValue(RegistroD100.VL_DOC, 123.34);
        line.setFieldValue(RegistroD100.VL_DESC, 12.34);
        line.setFieldValue(RegistroD100.IND_FRT, "0");
        line.setFieldValue(RegistroD100.VL_SERV, 123.34);
        line.setFieldValue(RegistroD100.VL_BC_ICMS, 123.34);
        line.setFieldValue(RegistroD100.VL_ICMS, 123.34);
        line.setFieldValue(RegistroD100.VL_NT, 123.34);
        line.setFieldValue(RegistroD100.COD_INF, "001abc");
        line.setFieldValue(RegistroD100.COD_CTA, "w123iuhsaduihasd");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
