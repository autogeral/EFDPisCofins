package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD501Test {
     public RegistroD501Test() {
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
    public void RegistroD501Test() {
        RegistroD501 reg = new RegistroD501();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD501.CST_PIS, 34L);
        //03
        line.setFieldValue(RegistroD501.VL_ITEM, 302.23);
        //04
        line.setFieldValue(RegistroD501.NAT_BC_CRED, "WD");
        //05
        line.setFieldValue(RegistroD501.VL_BC_PIS, 30232.23);
        //06
        line.setFieldValue(RegistroD501.ALIQ_PIS, 12345302.1234);
        //07
        line.setFieldValue(RegistroD501.VL_PIS, 352.33);
        //08
        line.setFieldValue(RegistroD501.COD_CTA, "ASDASDDDD3023");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//
//        String expected = "|D501|34|302,23|WD|30232,23|12345302,1234|352,33|ASDASDDDD3023|";
//        assertEquals (expected, sb.toString());
    }
}
