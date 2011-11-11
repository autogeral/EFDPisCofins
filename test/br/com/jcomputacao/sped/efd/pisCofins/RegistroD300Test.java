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
public class RegistroD300Test {

    public RegistroD300Test() {
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
    public void RegistroD300Test() throws ParseException {
        RegistroD300 reg = new RegistroD300();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");

        line.setFieldValue(RegistroD300.REG, "0100");
        line.setFieldValue(RegistroD300.COD_MOD, "12");
        line.setFieldValue(RegistroD300.SER, "1234");
        line.setFieldValue(RegistroD300.SUB, 123L);
        line.setFieldValue(RegistroD300.NUM_DOC_INI, 123456L);
        line.setFieldValue(RegistroD300.NUM_DOC_FIN, 123456L);
        line.setFieldValue(RegistroD300.CFOP, 1234L);
        line.setFieldValue(RegistroD300.DT_REF, data);
        line.setFieldValue(RegistroD300.VL_DOC, 123.34);
        line.setFieldValue(RegistroD300.VL_DESC, 12.34);
        line.setFieldValue(RegistroD300.CST_PIS, 23L);
        line.setFieldValue(RegistroD300.VL_BC_PIS, 123.12);
        line.setFieldValue(RegistroD300.ALIQ_PIS, 12345678.1234);
        line.setFieldValue(RegistroD300.VL_PIS, 123.34);
        line.setFieldValue(RegistroD300.CST_COFINS, 14L);
        line.setFieldValue(RegistroD300.VL_BC_COFINS, 214.32);
        line.setFieldValue(RegistroD300.ALIQ_COFINS, 123445678.1234);
        line.setFieldValue(RegistroD300.VL_COFINS, 314.45);
        line.setFieldValue(RegistroD300.COD_CTA, "w123iuhsaduihasd");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
