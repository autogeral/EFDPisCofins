package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD600Test {

    public RegistroD600Test() {
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
    public void RegistroD600Test() throws ParseException {
        RegistroD600 reg = new RegistroD600();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("08022013");

        
        //02
        line.setFieldValue(RegistroD600.COD_MOD, "12");
        //03
        line.setFieldValue(RegistroD600.COD_MUN, 1234567L);
        //04
        line.setFieldValue(RegistroD600.SER, "ABCD");
        //05
        line.setFieldValue(RegistroD600.SUB, 123L);
        //06
        line.setFieldValue(RegistroD600.IND_REC, 1L);
        //07
        line.setFieldValue(RegistroD600.QTD_CONS, 1234567L);
        //08
        line.setFieldValue(RegistroD600.DT_DOC_INI, data);
        //09
        line.setFieldValue(RegistroD600.DT_DOC_FIN, data);
        //10
        line.setFieldValue(RegistroD600.VL_DOC, 12367.34);
        //11
        line.setFieldValue(RegistroD600.VL_DESC, 12367.34);
        //12
        line.setFieldValue(RegistroD600.VL_SERV, 12367.34);
        //13
        line.setFieldValue(RegistroD600.VL_SERV_NT, 12367.34);
        //14
        line.setFieldValue(RegistroD600.VL_TERC, 12367.34);
        //15
        line.setFieldValue(RegistroD600.VL_DA, 12367.34);
        //16
        line.setFieldValue(RegistroD600.VL_BC_ICMS, 12367.34);
        //17
        line.setFieldValue(RegistroD600.VL_ICMS, 12367.34);
        //18
        line.setFieldValue(RegistroD600.VL_PIS, 12367.34);
        //19
        line.setFieldValue(RegistroD600.VL_COFINS, 12367.34);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|D600|12|1234567|ABCD|123|1|1234567|08022013|08022013|12367,34|12367,34|12367,34|12367,34|12367,34|12367,34|12367,34|12367,34|12367,34|12367,34|";
//        assertEquals (expected, sb.toString());
    }
}
