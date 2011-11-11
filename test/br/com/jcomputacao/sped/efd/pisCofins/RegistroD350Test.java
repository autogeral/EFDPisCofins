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
public class RegistroD350Test {

    public RegistroD350Test() {
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
    public void RegistroD350Test() throws ParseException {
        RegistroD350 reg = new RegistroD350();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
                
        line.setFieldValue(RegistroD350.REG, "0100");
        line.setFieldValue(RegistroD350.COD_MOD, "12");
        line.setFieldValue(RegistroD350.ECF_MOD, "1234567890123456789");
        line.setFieldValue(RegistroD350.ECF_FAB, "1234567891234567890");
        line.setFieldValue(RegistroD350.DT_DOC, data);
        line.setFieldValue(RegistroD350.CRO, 123L);
        line.setFieldValue(RegistroD350.CRZ, 123456L);
        line.setFieldValue(RegistroD350.NUM_COO_FIN, 123456L);
        line.setFieldValue(RegistroD350.GT_FIN, 123.34);
        line.setFieldValue(RegistroD350.VL_BRT, 12.34);
        line.setFieldValue(RegistroD350.CST_PIS, 23L);
        line.setFieldValue(RegistroD350.VL_BC_PIS, 123.12);
        line.setFieldValue(RegistroD350.ALIQ_PIS, 12345678.1234);
        line.setFieldValue(RegistroD350.QUANT_BC_PIS, 123.334);
        line.setFieldValue(RegistroD350.ALIQ_PIS_QUANT, 123.3422);
        line.setFieldValue(RegistroD350.VL_PIS, 123.34);
        line.setFieldValue(RegistroD350.CST_COFINS, 14L);
        line.setFieldValue(RegistroD350.VL_BC_COFINS, 214.32);
        line.setFieldValue(RegistroD350.ALIQ_COFINS, 123445678.1234);
        line.setFieldValue(RegistroD350.QUANT_BC_COFINS, 123445678.1234);
        line.setFieldValue(RegistroD350.ALIQ_COFINS_QUANT, 123445678.1234);
        line.setFieldValue(RegistroD350.VL_COFINS, 314.45);
        line.setFieldValue(RegistroD350.COD_CTA, "w123iuhsaduihasd");

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
