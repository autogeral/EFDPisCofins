package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 *
 * @author Ana Cláudia
 */
public class RegistroD205Test {

    public RegistroD205Test() {
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
    public void RegistroD205Test() {
        RegistroD205 reg = new RegistroD205();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD205.CST_COFINS, 41L);
        //03
        line.setFieldValue(RegistroD205.VL_ITEM, 124.76);
        //04
        line.setFieldValue(RegistroD205.VL_BC_COFINS, 973.55);
        //05
        line.setFieldValue(RegistroD205.ALIQ_COFINS, 12345678.1234);
        //06
        line.setFieldValue(RegistroD205.VL_COFINS, 123.45);
        //07
        line.setFieldValue(RegistroD205.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|D205|41|124,76|973,55|12345678,1234|123,45|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
