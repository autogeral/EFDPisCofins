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
 * 10/11/2011 19:57:36
 * @author Jonas
 */
public class RegistroA170Test {

    public RegistroA170Test() {
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
    public void registroA170test() throws ParseException {


        StringRandom stringRandom = new StringRandom();
        RegistroA170 reg = new RegistroA170();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroA170.REG, "0001");
        line.setFieldValue(RegistroA170.NUM_ITEM, 2135l);
        line.setFieldValue(RegistroA170.COD_ITEM, stringRandom.GeraStringRandom(60));
        line.setFieldValue(RegistroA170.DESCR_COMPL, stringRandom.GeraStringRandom(255));
        line.setFieldValue(RegistroA170.VL_ITEM, 2134.12);
        line.setFieldValue(RegistroA170.VL_DESC, 3.12);
        line.setFieldValue(RegistroA170.NAT_BC_CRED, "er");
        line.setFieldValue(RegistroA170.IND_ORIG_CRED, "q");
        line.setFieldValue(RegistroA170.CST_PIS, 49l);
        line.setFieldValue(RegistroA170.VL_BC_PIS, 4564.54);
        line.setFieldValue(RegistroA170.ALIQ_PIS, 4564.54);
        line.setFieldValue(RegistroA170.VL_PIS, 344.12);
        line.setFieldValue(RegistroA170.CST_COFINS, 86l);
        line.setFieldValue(RegistroA170.VL_BC_COFINS, 3.12);
        line.setFieldValue(RegistroA170.ALIQ_COFINS, 65428.32);
        line.setFieldValue(RegistroA170.VL_COFINS, 545464.98);
        line.setFieldValue(RegistroA170.COD_CTA, stringRandom.GeraStringRandom(60));
        line.setFieldValue(RegistroA170.COD_CCUS, stringRandom.GeraStringRandom(60));




        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
