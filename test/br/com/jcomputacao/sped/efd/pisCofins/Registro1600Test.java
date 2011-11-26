
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * 26/11/2011 10:25:56
 * @author Douglas
 */
public class Registro1600Test{

    public Registro1600Test() {
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
    public void Registro1600Test() throws ParseException{
        Registro1600 reg = new Registro1600();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1600.REG, "1600");
        line.setFieldValue(Registro1600.PER_APUR_ANT, rm.GeraLongRandom(6));
        line.setFieldValue(Registro1600.NAT_CONT_REC, rm.GeraStringRandom(2));
        line.setFieldValue(Registro1600.VL_CONT_APUR, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1600.VL_CRED_COFINS_DESC, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1600.VL_CONT_DEV, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1600.VL_OUT_DED, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1600.VL_CONT_EXT, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1600.VL_MUL, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1600.VL_JUR, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1600.DT_RECOL, rm.GeraLongRandom(8));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}