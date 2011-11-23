
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
 * 23/11/2011 10:48:18
 * @author Douglas
 */
public class RegistroF205Test {


  public RegistroF205Test() {

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
    public void registroF205test() throws ParseException {


        RegistroF205 reg = new RegistroF205();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF205.REG, "F205");
        line.setFieldValue(RegistroF205.VL_CUS_INC_ACUM_ANT, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CUS_INC_PER_ESC, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CUS_INC_ACUM, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_EXC_BC_CUS_INC_ACUM, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_BC_CUS_INC, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.CST_PIS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF205.ALIQ_PIS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF205.VL_CRED_PIS_ACUM, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC_ANT, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC_FUT, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.CST_COFINS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF205.ALIQ_COFINS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_ACUM, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC_ANT, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC_FUT, rm.GeraDoubleRandom(8));

        StringBuffer r = line.getRepresentation();
        System.out.print(r);

}
}