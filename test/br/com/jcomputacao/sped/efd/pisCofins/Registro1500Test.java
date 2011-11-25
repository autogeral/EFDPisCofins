
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
 * 25/11/2011 11:43:00
 * @author Douglas
 */
public class Registro1500Test{

    public Registro1500Test() {
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
    public void Registro1500Test() throws ParseException{
        Registro1500 reg = new Registro1500();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1500.REG, "1500");
        line.setFieldValue(Registro1500.PER_APU_CRED, rm.GeraLongRandom(6));
        line.setFieldValue(Registro1500.ORIG_CRED, rm.GeraLongRandom(2));
        line.setFieldValue(Registro1500.CNPJ_SUC, rm.GeraLongRandom(14));
        line.setFieldValue(Registro1500.COD_CRED, rm.GeraLongRandom(3));
        line.setFieldValue(Registro1500.VL_CRED_APU, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_EXT_APU, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_TOT_CRED_APU, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_DESC_PA_ANT, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_PER_PA_ANT, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_DCOMP_PA_ANT, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.SD_CRED_DISP_EFD, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_DESC_EFD, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_PER_EFD, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_DCOMP_EFD, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_TRANS, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.VL_CRED_OUT, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1500.SLD_CRED_FIM, rm.GeraDoubleRandom(2));


        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}