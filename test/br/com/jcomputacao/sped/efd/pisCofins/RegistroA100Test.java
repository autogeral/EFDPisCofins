/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 09/11/2011 19:53:17
 * @author Jonas
 */
public class RegistroA100Test {

    public RegistroA100Test() {
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
    public void registroA100test() throws ParseException {
        RegistroA100 reg = new RegistroA100();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("10101987");
        String Str60 = "";

        while (Str60.length() <= 60) {
            Random r = new Random();
            Str60 += (char) r.nextInt();
        }

        line.setFieldValue(RegistroA100.REG, "0001");
        line.setFieldValue(RegistroA100.IND_OPER, "0");
        line.setFieldValue(RegistroA100.IND_EMIT, "1");
        line.setFieldValue(RegistroA100.COD_PART, Str60);
        line.setFieldValue(RegistroA100.COD_SIT, 00l);
        line.setFieldValue(RegistroA100.SER, Str60.substring(20, 40));
        line.setFieldValue(RegistroA100.SUB, Str60.substring(10, 30));
        line.setFieldValue(RegistroA100.NUM_DOC, Str60);
        line.setFieldValue(RegistroA100.CHV_NFSE, Str60);
        line.setFieldValue(RegistroA100.DT_DOC, data );
        line.setFieldValue(RegistroA100.DT_EXE_SERV, data);
        line.setFieldValue(RegistroA100.VL_DOC, 100.02);
        line.setFieldValue(RegistroA100.IND_PGTO, Str60);
        line.setFieldValue(RegistroA100.VL_DESC, 99.85);
        line.setFieldValue(RegistroA100.VL_BC_PIS, 65284.15);
        line.setFieldValue(RegistroA100.VL_PIS, 212.12);
        line.setFieldValue(RegistroA100.VL_BC_COFINS, 3235.10);
        line.setFieldValue(RegistroA100.VL_COFINS, 02.05);
        line.setFieldValue(RegistroA100.VL_PIS_RET, 98754.02);
        line.setFieldValue(RegistroA100.VL_COFINS_RET, 9856.56);
        line.setFieldValue(RegistroA100.VL_ISS, 985.75);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}
