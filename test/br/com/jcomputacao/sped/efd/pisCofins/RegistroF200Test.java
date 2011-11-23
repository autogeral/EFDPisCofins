
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
 * 18/11/2011 11:48:53
 * @author Douglas
 */
public class RegistroF200Test {


  public RegistroF200Test() {

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
    public void registroF200test() throws ParseException {


        RegistroF200 reg = new RegistroF200();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF200.REG, "F200");
        line.setFieldValue(RegistroF200.IND_OPER, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF200.UNID_IMOB, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF200.IDENT_EMP, rm.GeraStringRandom(255));
        line.setFieldValue(RegistroF200.DESC_UNID_IMOB, rm.GeraStringRandom(90));
        line.setFieldValue(RegistroF200.NUM_CONT, rm.GeraStringRandom(90));
        line.setFieldValue(RegistroF200.CPF_CNPJ_ADQU, rm.GeraStringRandom(14));
        line.setFieldValue(RegistroF200.DT_OPER, rm.GeraLongRandom(8));
        line.setFieldValue(RegistroF200.VL_TOT_VEND, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF200.VL_REC_ACUM, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF200.VL_TOT_REC, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF200.CST_PIS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF200.VL_BC_PIS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF200.ALIQ_PIS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF200.VL_PIS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF200.CST_COFINS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF200.VL_BC_COFINS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF200.ALIQ_COFINS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF200.VL_COFINS, rm.GeraDoubleRandom(2));
        line.setFieldValue(RegistroF200.PERC_REC_RECEB, rm.GeraDoubleRandom(6));
        line.setFieldValue(RegistroF200.IND_NAT_EMP, rm.GeraLongRandom(1));
        line.setFieldValue(RegistroF200.INF_COMP, rm.GeraStringRandom(90));

        StringBuffer r = line.getRepresentation();
        System.out.print(r);

}
}
