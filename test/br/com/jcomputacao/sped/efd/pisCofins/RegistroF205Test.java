
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;


/**
 * 23/11/2011 10:48:18
 * @author Douglas
 */
public class RegistroF205Test {


  public RegistroF205Test() {

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
    public void registroF205test() throws ParseException {


        RegistroF205 reg = new RegistroF205();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroF205.VL_CUS_INC_ACUM_ANT, 123.23);
        //03
        line.setFieldValue(RegistroF205.VL_CUS_INC_PER_ESC, 123.23);
        //04
        line.setFieldValue(RegistroF205.VL_CUS_INC_ACUM, 123.23);
        //05
        line.setFieldValue(RegistroF205.VL_EXC_BC_CUS_INC_ACUM, 123.23);
        //06
        line.setFieldValue(RegistroF205.VL_BC_CUS_INC, 123.23);
        //07
        line.setFieldValue(RegistroF205.CST_PIS, 12);
        //08
        line.setFieldValue(RegistroF205.ALIQ_PIS, 123.1234);
        //09
        line.setFieldValue(RegistroF205.VL_CRED_PIS_ACUM, 123.23);
        //10
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC_ANT, 123.23);
        //11
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC, 123.23);
        //12
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC_FUT, 123.23);
        //13
        line.setFieldValue(RegistroF205.CST_COFINS, 13);
        //14
        line.setFieldValue(RegistroF205.ALIQ_COFINS, 123.1234);
        //15
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_ACUM, 123.23);
        //16
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC_ANT, 123.23);
        //17
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC, 123.23);
        //18
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC_FUT, 123.23);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|F205|123,23|123,23|123,23|123,23|123,23|12|123,1234|123,23|123,23|123,23|123,23|13|123,1234|123,23|123,23|123,23|123,23|";
        assertEquals (expected, sb.toString());

}
}