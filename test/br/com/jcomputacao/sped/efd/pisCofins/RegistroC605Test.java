package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroC605Test {

    public RegistroC605Test() {
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
    public void RegistroC605Test() {
        RegistroC605 reg = new RegistroC605();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC605.CST_COFINS, 35L);
        //03
        line.setFieldValue(RegistroC605.VL_ITEM, 222.76);
        //04
        line.setFieldValue(RegistroC605.VL_BC_COFINS, 493.45);
        //05
        line.setFieldValue(RegistroC605.ALIQ_COFINS, 11111111.4444);
        //06
        line.setFieldValue(RegistroC605.VL_COFINS, 234.34);
        //07
        line.setFieldValue(RegistroC605.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|C605|35|222,76|493,45|11111111,4444|234,34|Código da conta analítica contábil debitada/creditada|";
        assertEquals (expected, sb.toString());
    }
}
