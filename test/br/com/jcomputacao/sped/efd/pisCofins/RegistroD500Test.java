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
public class RegistroD500Test {

    public RegistroD500Test() {
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
    public void RegistroD500Test() throws ParseException {
        RegistroD500 reg = new RegistroD500();
        LineModel line = reg.createModel();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");

        line.setFieldValue(RegistroD500.REG, "0100");
        line.setFieldValue(RegistroD500.IND_OPER, "0");
        line.setFieldValue(RegistroD500.IND_EMIT, "0");
        line.setFieldValue(RegistroD500.COD_PART, "0101SADA12DA0");
        line.setFieldValue(RegistroD500.COD_MOD, "01");
        line.setFieldValue(RegistroD500.COD_SIT, 98L);
        line.setFieldValue(RegistroD500.SER, "0100");
        line.setFieldValue(RegistroD500.SUB, 123L);
        line.setFieldValue(RegistroD500.NUM_DOC, 123456789123456789L);
        line.setFieldValue(RegistroD500.DT_DOC, data);
        line.setFieldValue(RegistroD500.DT_A_P, data);
        line.setFieldValue(RegistroD500.VL_DOC, 145.34);
        line.setFieldValue(RegistroD500.VL_DESC, 1432.23);
        line.setFieldValue(RegistroD500.VL_SERV, 152.56);
        line.setFieldValue(RegistroD500.VL_SERV_NT, 1412.34);
        line.setFieldValue(RegistroD500.VL_TERC, 123.76);
        line.setFieldValue(RegistroD500.VL_DA, 142.45);
        line.setFieldValue(RegistroD500.VL_BC_ICMS, 183.89);
        line.setFieldValue(RegistroD500.VL_ICMS, 158.87);
        line.setFieldValue(RegistroD500.COD_INF, "2F0100");
        line.setFieldValue(RegistroD500.VL_PIS, 12222223.43);
        line.setFieldValue(RegistroD500.VL_COFINS, 1235.34);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
