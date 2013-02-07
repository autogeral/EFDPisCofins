package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD201Test {

    public RegistroD201Test() {
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
    public void RegistroD201Test() {
        RegistroD201 reg = new RegistroD201();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD201.CST_PIS, 41L);
        //03
        line.setFieldValue(RegistroD201.VL_ITEM, 124.76);
        //04
        line.setFieldValue(RegistroD201.VL_BC_PIS, 973.55);
        //05
        line.setFieldValue(RegistroD201.ALIQ_PIS, 12345678.1234);
        //06
        line.setFieldValue(RegistroD201.VL_PIS, 123.45);
        //07
        line.setFieldValue(RegistroD201.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//
//        String expected = "|D201|41|124,76|973,55|12345678,1234|123,45|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
