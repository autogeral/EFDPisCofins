package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 10/11/2011 21:48:06
 * @author John
 */
public class RegistroC500Test {

    public RegistroC500Test(){   
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
    public void RegistroC500Test() throws ParseException {
         RegistroC500 reg = new RegistroC500();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("05022013");
        
        //02
        line.setFieldValue(RegistroC500.COD_PART, "(campo 02 do Registro 0150)");
        //03
        line.setFieldValue(RegistroC500.COD_MOD, "12");
        //04
        line.setFieldValue(RegistroC500.COD_SIT, 34L);
        //05
        line.setFieldValue(RegistroC500.SER, "ABCD");
        //06
        line.setFieldValue(RegistroC500.SUB, 123L);
        //07
        line.setFieldValue(RegistroC500.NUM_DOC, 123456789L);
        //08
        line.setFieldValue(RegistroC500.DT_DOC, data);
        //09
        line.setFieldValue(RegistroC500.DT_ENT, data);
        //10
        line.setFieldValue(RegistroC500.VL_DOC, 12345678911.11);
        //11
        line.setFieldValue(RegistroC500.VL_ICMS, 45678911.11);
        //12
        line.setFieldValue(RegistroC500.COD_INF, "ABCDEF");
        //13
        line.setFieldValue(RegistroC500.VL_PIS, 678911.11);
        //14
        line.setFieldValue(RegistroC500.VL_COFINS, 678911.11);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C500|(campo 02 do Registro 0150)|12|34|ABCD|123|123456789|05022013|05022013|12345678911,11|45678911,11|ABCDEF|678911,11|678911,11|";
//        assertEquals (expected, sb.toString());
    }
}
