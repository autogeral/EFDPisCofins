
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 26/11/2011 11:07:33
 * @author Douglas
 */
public class Registro1620Test{

    public Registro1620Test() {
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
    public void Registro1620Test() throws ParseException{
        Registro1620 reg = new Registro1620();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1620.REG, "1620");
        line.setFieldValue(Registro1620.PER_APU_CRED, rm.GeraLongRandom(6));
        line.setFieldValue(Registro1620.ORIG_CRED, rm.GeraLongRandom(2));
        line.setFieldValue(Registro1620.COD_CRED, rm.GeraLongRandom(3));
        line.setFieldValue(Registro1620.VL_CRED, rm.GeraDoubleRandom(2));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}
