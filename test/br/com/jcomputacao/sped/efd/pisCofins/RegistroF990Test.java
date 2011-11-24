
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
 * 24/11/2011 12:00:27
 * @author Douglas
 */
public class RegistroF990Test {


  public RegistroF990Test() {

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
    public void registroF990test() throws ParseException {

      RegistroF990 reg = new RegistroF990();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF990.REG, "F990");
        line.setFieldValue(RegistroF990.QTD_LIN_F, rm.GeraLongRandom(19));

        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}
