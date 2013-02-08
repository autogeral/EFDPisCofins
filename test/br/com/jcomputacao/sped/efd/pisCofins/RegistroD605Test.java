package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.sped.efd.COFINSCofins.RegistroD605;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD605Test {
        public RegistroD605Test() {
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
    public void RegistroD605Test() {
        RegistroD605 reg = new RegistroD605();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD605.COD_CLASS, 1234L);
        //03
        line.setFieldValue(RegistroD605.VL_ITEM, 1432.12);
        //04
        line.setFieldValue(RegistroD605.VL_DESC, 1234.53);
        //05
        line.setFieldValue(RegistroD605.CST_COFINS, 14L);
        //06
        line.setFieldValue(RegistroD605.VL_BC_COFINS, 1234.64);
        //07
        line.setFieldValue(RegistroD605.ALIQ_COFINS, 14321234.1234);
        //08
        line.setFieldValue(RegistroD605.VL_COFINS, 1234.34);
        //09
        line.setFieldValue(RegistroD605.COD_CTA, "Código da conta contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|D605|1234|1432,12|1234,53|14|1234,64|14321234,1234|1234,34|Código da conta contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
