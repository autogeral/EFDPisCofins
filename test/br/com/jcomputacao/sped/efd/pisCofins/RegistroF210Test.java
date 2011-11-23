
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
 * 23/11/2011 11:54:05
 * @author Douglas
 */
public class RegistroF210Test {


  public RegistroF210Test() {

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
    public void registroF200test() throws ParseException {

      RegistroF210 reg = new RegistroF210();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF210.REG, "F210");
        line.setFieldValue(RegistroF210.VL_CUS_ORC, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF210.VL_EXC, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF210.VL_CUS_ORC_AJU, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF210.VL_BC_CRED, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF210.CST_PIS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF210.ALIQ_PIS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF210.VL_CRED_PIS_UTIL, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF210.CST_COFINS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF210.ALIQ_COFINS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF210.VL_CRED_COFINS_UTIL, rm.GeraDoubleRandom(2));


        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}
