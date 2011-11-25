package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 25/11/2011 09:40:34
 * @author Douglas
 */
public class Registro1300Test{

    public Registro1300Test() {
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
    public void Registro1300Test() throws ParseException{
        Registro1300 reg = new Registro1300();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();

       
        line.setFieldValue(Registro1300.REG, "1300");
        line.setFieldValue(Registro1300.IND_NAT_RET, rm.GeraLongRandom(2));
        line.setFieldValue(Registro1300.PR_REC_RET, rm.GeraLongRandom(6));
        line.setFieldValue(Registro1300.VL_RET_APU, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1300.VL_RET_DED, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1300.VL_RET_PER, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1300.VL_RET_DCOMP, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1300.SLD_RET, rm.GeraDoubleRandom(2));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}