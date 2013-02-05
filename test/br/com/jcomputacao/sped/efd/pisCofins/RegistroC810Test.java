package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Feb 5, 2013 2:59:34 PM
 * @author Jennifer
 */
public class RegistroC810Test {
    public RegistroC810Test() {
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
    public void RegistroC810Test() {
        RegistroC810 reg = new RegistroC810();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC810.CFOP, 1234L);
        //03
        line.setFieldValue(RegistroC810.VL_ITEM, 1.99);
        //04
        line.setFieldValue(RegistroC810.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //05
        line.setFieldValue(RegistroC810.CST_PIS, 1);
        //06
        line.setFieldValue(RegistroC810.VL_BC_PIS, 3.99);
        //07
        line.setFieldValue(RegistroC810.ALIQ_PIS, 4.9999);
        //08
        line.setFieldValue(RegistroC810.VL_PIS, 5.99);
        //09
        line.setFieldValue(RegistroC810.CST_COFINS, 2);
        //10
        line.setFieldValue(RegistroC810.VL_BC_COFINS, null);
        //11
        line.setFieldValue(RegistroC810.ALIQ_COFINS, 6.9999);
        //12
        line.setFieldValue(RegistroC810.VL_COFINS, 7.99);
        //13
        line.setFieldValue(RegistroC810.COD_CTA, "Código da conta analítica contábil debitada/creditada");


        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|C810|1234|1,99|Código do item (campo 02 do Registro 0200)|01|3,99|4,9999|5,99|02||6,9999|7,99|";
        assertEquals (expected, sb.toString());
    }
}
