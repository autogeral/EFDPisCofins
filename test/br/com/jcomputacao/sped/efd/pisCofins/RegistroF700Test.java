
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
 * 24/11/2011 11:12:19
 * @author Douglas
 */
public class RegistroF700Test {


  public RegistroF700Test() {

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
    public void registroF700test() throws ParseException {

      RegistroF700 reg = new RegistroF700();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF700.REG, "F700");
        line.setFieldValue(RegistroF700.IND_ORI_DED, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF700.IND_NAT_DED, rm.GeraLongRandom(1));
        line.setFieldValue(RegistroF700.VL_DED_PIS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF700.VL_DED_COFINS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF700.VL_BC_OPER, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF700.CNPJ, rm.GeraLongRandom(14));
        line.setFieldValue(RegistroF700.INF_COMP, rm.GeraStringRandom(90));


        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}