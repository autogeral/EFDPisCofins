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
public class RegistroD300Test {

    public RegistroD300Test() {
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
    public void RegistroD300Test() throws ParseException {
        RegistroD300 reg = new RegistroD300();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");

        //02
        line.setFieldValue(RegistroD300.COD_MOD, "12");
        //03
        line.setFieldValue(RegistroD300.SER, "1234");
        //04
        line.setFieldValue(RegistroD300.SUB, 123L);
        //05
        line.setFieldValue(RegistroD300.NUM_DOC_INI, 123456L);
        //06
        line.setFieldValue(RegistroD300.NUM_DOC_FIN, 123456L);
        //07
        line.setFieldValue(RegistroD300.CFOP, 1234L);
        //08
        line.setFieldValue(RegistroD300.DT_REF, data);
        //09
        line.setFieldValue(RegistroD300.VL_DOC, 123.34);
        //10
        line.setFieldValue(RegistroD300.VL_DESC, 12.34);
        //11
        line.setFieldValue(RegistroD300.CST_PIS, 23L);
        //12
        line.setFieldValue(RegistroD300.VL_BC_PIS, 123.12);
        //13
        line.setFieldValue(RegistroD300.ALIQ_PIS, 1234567.1234);
        //14
        line.setFieldValue(RegistroD300.VL_PIS, 123.34);
        //15
        line.setFieldValue(RegistroD300.CST_COFINS, 14L);
        //16
        line.setFieldValue(RegistroD300.VL_BC_COFINS, 214.32);
        //17
        line.setFieldValue(RegistroD300.ALIQ_COFINS, 12344567.1234);
        //18
        line.setFieldValue(RegistroD300.VL_COFINS, 314.45);
        //19
        line.setFieldValue(RegistroD300.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        
StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//String expected = "|D300|12|1234|123|123456|123456|1234|17121986|123,34|12,34|23|123,12|1234567,1234|123,34|14|214,32|12344567,1234|314,45|Código da conta analítica contábil debitada/creditada|";
//assertEquals (expected, sb.toString());
    }
}
