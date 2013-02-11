
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 23/11/2011 11:54:05
 * @author Douglas
 */
public class RegistroF210Test {


  public RegistroF210Test() {

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
    public void registroF210test() throws ParseException {

      RegistroF210 reg = new RegistroF210();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF210.VL_CUS_ORC, 123.23);
        //03
        line.setFieldValue(RegistroF210.VL_EXC, 123.23);
        //04
        line.setFieldValue(RegistroF210.VL_CUS_ORC_AJU, 123.23);
        //05
        line.setFieldValue(RegistroF210.VL_BC_CRED, 123.23);
        //06
        line.setFieldValue(RegistroF210.CST_PIS, 12);
        //07
        line.setFieldValue(RegistroF210.ALIQ_PIS, 123.2334);
        //08
        line.setFieldValue(RegistroF210.VL_CRED_PIS_UTIL, 123.23);
        //09
        line.setFieldValue(RegistroF210.CST_COFINS, 13);
        //10
        line.setFieldValue(RegistroF210.ALIQ_COFINS, 123.2334);
        //11
        line.setFieldValue(RegistroF210.VL_CRED_COFINS_UTIL, 123.23);


        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F210|123,23|123,23|123,23|123,23|12|123,2334|123,23|13|123,2334|123,23|";
//        assertEquals (expected, sb.toString());

    }
}
