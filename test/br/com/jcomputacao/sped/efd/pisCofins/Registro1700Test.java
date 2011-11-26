
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 26/11/2011 11:24:13
 * @author Douglas
 */
public class Registro1700Test{

    public Registro1700Test() {
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
    public void Registro1700Test() throws ParseException{
        Registro1700 reg = new Registro1700();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1700.REG, "1700");
        line.setFieldValue(Registro1700.IND_NAT_RET, rm.GeraLongRandom(2));
        line.setFieldValue(Registro1700.PR_REC_RET, rm.GeraLongRandom(6));
        line.setFieldValue(Registro1700.VL_RET_APU, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1700.VL_RET_DED, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1700.VL_RET_PER, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1700.VL_RET_DCOMP, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1700.SLD_RET, rm.GeraDoubleRandom(2));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}
