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
public class RegistroD350Test {

    public RegistroD350Test() {
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
    public void RegistroD350Test() throws ParseException {
        RegistroD350 reg = new RegistroD350();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("07022013");
                
        //02
        line.setFieldValue(RegistroD350.COD_MOD, "12");
        //03
        line.setFieldValue(RegistroD350.ECF_MOD, "12345678901234567890");
        //04
        line.setFieldValue(RegistroD350.ECF_FAB, "12345678901234567890");
        //05
        line.setFieldValue(RegistroD350.DT_DOC, data);
        //06
        line.setFieldValue(RegistroD350.CRO, 123L);
        //07
        line.setFieldValue(RegistroD350.CRZ, 123456L);
        //08
        line.setFieldValue(RegistroD350.NUM_COO_FIN, 123456L);
        //09
        line.setFieldValue(RegistroD350.GT_FIN, 123.34);
        //10
        line.setFieldValue(RegistroD350.VL_BRT, 12.34);
        //11
        line.setFieldValue(RegistroD350.CST_PIS, 23L);
        //12
        line.setFieldValue(RegistroD350.VL_BC_PIS, 123.12);
        //13
        line.setFieldValue(RegistroD350.ALIQ_PIS, 12345678.1234);
        //14
        line.setFieldValue(RegistroD350.QUANT_BC_PIS, 123.334);
        //15
        line.setFieldValue(RegistroD350.ALIQ_PIS_QUANT, 123.3422);
        //16
        line.setFieldValue(RegistroD350.VL_PIS, 123.34);
        //17
        line.setFieldValue(RegistroD350.CST_COFINS, 14L);
        //18
        line.setFieldValue(RegistroD350.VL_BC_COFINS, 214.32);
        //19
        line.setFieldValue(RegistroD350.ALIQ_COFINS, 123445678.1234);
        //20
        line.setFieldValue(RegistroD350.QUANT_BC_COFINS, 123445678.123);
        //21
        line.setFieldValue(RegistroD350.ALIQ_COFINS_QUANT, 123445678.1234);
        //22
        line.setFieldValue(RegistroD350.VL_COFINS, 314.45);
        //23
        line.setFieldValue(RegistroD350.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|D350|12|12345678901234567890|12345678901234567890|07022013|123|123456|123456|123,34|12,34|23|123,12|12345678,1234|123,334|123,3422|123,34|14|214,32|123445678,123|123445678,123|123445678,1234|314,45|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
