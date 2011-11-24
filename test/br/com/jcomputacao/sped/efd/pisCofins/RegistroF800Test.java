
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
 * 24/11/2011 11:38:15
 * @author Douglas
 */
public class RegistroF800Test {


  public RegistroF800Test() {

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
    public void registroF800test() throws ParseException {

      RegistroF800 reg = new RegistroF800();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF800.REG, "F800");
        line.setFieldValue(RegistroF800.IND_NAT_EVEN, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF800.DT_EVEN, rm.GeraLongRandom(8));
        line.setFieldValue(RegistroF800.CNPJ_SUCED, rm.GeraLongRandom(14));
        line.setFieldValue(RegistroF800.PA_CONT_CRED, rm.GeraLongRandom(6));
        line.setFieldValue(RegistroF800.COD_CRED, rm.GeraLongRandom(3));
        line.setFieldValue(RegistroF800.VL_CRED_PIS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF800.VL_CRED_COFINS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF800.PER_CRED_CIS, rm.GeraDoubleRandom(6));


        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}
