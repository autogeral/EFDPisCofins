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
public class RegistroD100Test {

    public RegistroD100Test() {
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
    public void RegistroD100Test() throws ParseException {
        RegistroD100 reg = new RegistroD100();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("07022013");

        //02
        line.setFieldValue(RegistroD100.IND_OPER, "1");
        //03
        line.setFieldValue(RegistroD100.IND_EMIT, "2");
        //04
        line.setFieldValue(RegistroD100.COD_PART, "Código do participante (campo 02 do Registro 0150)");
        //05
        line.setFieldValue(RegistroD100.COD_MOD, "12");
        //06
        line.setFieldValue(RegistroD100.COD_SIT, 21L);
        //07
        line.setFieldValue(RegistroD100.SER, "1234");
        //08
        line.setFieldValue(RegistroD100.SUB, "123");
        //09
        line.setFieldValue(RegistroD100.NUM_DOC, 123456789L);
        //10
        line.setFieldValue(RegistroD100.CHV_CTE, "00000000001111111111222222222233333333334444");
        //11
        line.setFieldValue(RegistroD100.DT_DOC, data);
        //12
        line.setFieldValue(RegistroD100.DT_A_P, data);
        //13
        line.setFieldValue(RegistroD100.TP_CTe, 3L);
        //14
        line.setFieldValue(RegistroD100.CHV_CTE_REF, "00000000001111111111222222222233333333334444");
        //15
        line.setFieldValue(RegistroD100.VL_DOC, 123.34);
        //16
        line.setFieldValue(RegistroD100.VL_DESC, 12.34);
        //17
        line.setFieldValue(RegistroD100.IND_FRT, "0");
        //18
        line.setFieldValue(RegistroD100.VL_SERV, 123.34);
        //19
        line.setFieldValue(RegistroD100.VL_BC_ICMS, 123.34);
        //20
        line.setFieldValue(RegistroD100.VL_ICMS, 123.34);
        //21
        line.setFieldValue(RegistroD100.VL_NT, 123.34);
        //22
        line.setFieldValue(RegistroD100.COD_INF, "123456");
        //23
        line.setFieldValue(RegistroD100.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|D100|1|2|Código do participante (campo 02 do Registro 0150)|12|21|1234|123|123456789|00000000001111111111222222222233333333334444|07022013|07022013|3|00000000001111111111222222222233333333334444|123,34|12,34|0|123,34|123,34|123,34|123,34|123456|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
