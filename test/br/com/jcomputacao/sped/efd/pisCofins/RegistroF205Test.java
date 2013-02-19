
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
        
        double campo02 = 123.23;
        double campo03 = 123.23;
        double campo04;
        double campo05 = 123.23;
        double campo06;
        double campo08 = 0.0165;
        double campo09;
        double campo10 = 123.23;
        double campo11 = 123.23;
        double campo12;
        double campo14 = 0.076;
        double campo15;
        double campo16 = 123.23;
        double campo17 = 123.23;
        double campo18;

        //02
        line.setFieldValue(RegistroF205.VL_CUS_INC_ACUM_ANT, campo02);
        //03
        line.setFieldValue(RegistroF205.VL_CUS_INC_PER_ESC, campo03);
        //04
        campo04 = campo02+campo03;
        line.setFieldValue(RegistroF205.VL_CUS_INC_ACUM, campo04);
        //05
        line.setFieldValue(RegistroF205.VL_EXC_BC_CUS_INC_ACUM, campo05);
        //06
        campo06 = campo04-campo05;
        line.setFieldValue(RegistroF205.VL_BC_CUS_INC, campo06);
        //07
        line.setFieldValue(RegistroF205.CST_PIS, 12);
        //08
        line.setFieldValue(RegistroF205.ALIQ_PIS, campo08);
        //09
        campo09 = campo06*campo08;
        line.setFieldValue(RegistroF205.VL_CRED_PIS_ACUM, campo09);
        //10
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC_ANT, campo10);
        //11
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC, campo11);
        //12
        campo12 = campo09-campo10-campo11;
        line.setFieldValue(RegistroF205.VL_CRED_PIS_DESC_FUT, campo12);
        //13
        line.setFieldValue(RegistroF205.CST_COFINS, 13);
        //14
        line.setFieldValue(RegistroF205.ALIQ_COFINS, campo14);
        //15
        campo15 = campo06*campo14;
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_ACUM, campo15);
        //16
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC_ANT, campo16);
        //17
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC, campo17);
        //18
        campo18 = campo15-campo16-campo17;
        line.setFieldValue(RegistroF205.VL_CRED_COFINS_DESC_FUT, campo18);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|F205|123,23|123,23|246,46|123,23|123,23|12|0,0165|2,03|123,23|123,23|-244,43|13|123,1234|123,23|123,23|123,23|123,23|";
        //assertEquals (expected, sb.toString());

}
}