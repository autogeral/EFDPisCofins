
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 26/11/2011 11:37:15
 * @author Douglas
 */
public class Registro1800Test{

    public Registro1800Test() {
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
    public void Registro1800Test() throws ParseException{
        Registro1800 reg = new Registro1800();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1800.REG, "1809");
        line.setFieldValue(Registro1800.INC_IMOB, rm.GeraStringRandom(90));
        line.setFieldValue(Registro1800.REC_RECEB_RET, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1800.REC_FIN_RET, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1800.BC_RET, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1800.ALIQ_RET, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1800.VL_REC_UNI, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1800.DT_REC_UNI, rm.GeraLongRandom(8));
        line.setFieldValue(Registro1800.COD_REC, rm.GeraStringRandom(4));


        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}
