package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 22:37:53
 * @author John
 */
public class RegistroC600Test {

    public RegistroC600Test() {
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
    public void RegistroC600Test() throws ParseException {
                RegistroC600 reg = new RegistroC600();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("05022013");
        
        //02
        line.setFieldValue(RegistroC600.COD_MOD, "12");
        //03
        line.setFieldValue(RegistroC600.COD_MUN, 1234567L);
        //04
        line.setFieldValue(RegistroC600.SER, "ABCD");
        //05
        line.setFieldValue(RegistroC600.SUB, 123L);
        //06
        line.setFieldValue(RegistroC600.COD_CONS, 99L);
        //07
        line.setFieldValue(RegistroC600.QTD_CONS, 1234567891234567891L);
        //08
        line.setFieldValue(RegistroC600.QTD_CANC, 1234567891234567891L);
        //09
        line.setFieldValue(RegistroC600.DT_DOC, data);
        //10
        line.setFieldValue(RegistroC600.VL_DOC, 123456789012.11);
        //11
        line.setFieldValue(RegistroC600.VL_DESC, 123456789012.11);
        //12
        line.setFieldValue(RegistroC600.CONS, 1234567891234567891l);
        //13
        line.setFieldValue(RegistroC600.VL_FORN, 123456789012.11);
        //14
        line.setFieldValue(RegistroC600.VL_SERV_NT, 123456789012.11);
        //15
        line.setFieldValue(RegistroC600.VL_TERC, 123456789012.11);
        //16
        line.setFieldValue(RegistroC600.VL_DA, 123456789012.11);
        //17
        line.setFieldValue(RegistroC600.VL_BC_ICMS, 123456789012.11);
        //18
        line.setFieldValue(RegistroC600.VL_ICMS, 123456789012.11);
        //19
        line.setFieldValue(RegistroC600.VL_BC_ICMS_ST, 123456789012.11);
        //20
        line.setFieldValue(RegistroC600.VL_ICMS_ST, 123456789012.11);
        //21
        line.setFieldValue(RegistroC600.VL_PIS, 123456789012.11);
        //22
        line.setFieldValue(RegistroC600.VL_COFINS, 123456789012.11);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C600|12|1234567|ABCD|123|99|1234567891234567891|1234567891234567891|05022013|123456789012,11|123456789012,11|1234567891234567891|123456789012,11|123456789012,11|123456789012,11|123456789012,11|123456789012,11|123456789012,11|123456789012,11|123456789012,11|123456789012,11|123456789012,11|";
//        assertEquals (expected, sb.toString());
    }
}
