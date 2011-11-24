
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
 * 24/11/2011 09:24:13
 * @author Douglas
 */
public class RegistroF600Test {


  public RegistroF600Test() {

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
    public void registroF600test() throws ParseException {

      RegistroF600 reg = new RegistroF600();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF600.REG, "F600");
        line.setFieldValue(RegistroF600.IND_NAT_RET, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF600.DT_RET, rm.GeraLongRandom(8));
        line.setFieldValue(RegistroF600.VL_BC_RET, rm.GeraDoubleRandom(4));
        line.setFieldValue(RegistroF600.VL_RET, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF600.COD_REC, rm.GeraStringRandom(4));
        line.setFieldValue(RegistroF600.IND_NAT_REC, rm.GeraLongRandom(1));
        line.setFieldValue(RegistroF600.CNPJ, rm.GeraLongRandom(1));
        line.setFieldValue(RegistroF600.VL_RET_PIS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF600.VL_RET_COFINS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF600.IND_DEC, rm.GeraLongRandom(1));


        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}