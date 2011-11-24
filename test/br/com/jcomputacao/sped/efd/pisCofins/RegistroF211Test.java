
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
 * 24/11/2011 08:35:36
 * @author Douglas
 */
public class RegistroF211Test {


  public RegistroF211Test() {

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
    public void registroF211test() throws ParseException {

      RegistroF211 reg = new RegistroF211();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF211.REG, "F211");
        line.setFieldValue(RegistroF211.NUM_PROC, rm.GeraStringRandom(20));
        line.setFieldValue(RegistroF211.IND_PROC, rm.GeraStringRandom(1));
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}
