package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 19:58:05
 * @author John
 */
public class RegistroC481Test {

    public RegistroC481Test() {
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

    /**
     * Test of getNome method, of class RegistroC481.
     */
    @Test
    public void RegistroC481Test() {
        RegistroC481 reg = new RegistroC481();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC481.CST_PIS, 99L);
        //03
        line.setFieldValue(RegistroC481.VL_ITEM, 78911.11);
        //04
        line.setFieldValue(RegistroC481.VL_BC_PIS, 678911.11);
        //05
        line.setFieldValue(RegistroC481.ALIQ_PIS, 12345678.9901);
        //06
        line.setFieldValue(RegistroC481.QUANT_BC_PIS, 5678911.111);
        //07
        line.setFieldValue(RegistroC481.ALIQ_PIS_QUANT, 45678911.11111);
        //08
        line.setFieldValue(RegistroC481.VL_PIS, 78911.11);
        //09
        line.setFieldValue(RegistroC481.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //10
        line.setFieldValue(RegistroC481.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
        String expected = "|C481|99|78911,11|678911,11|12345678,9901|5678911,111|45678911,1111|78911,11|Código do item (campo 02 do Registro 0200)|Código da conta analítica contábil debitada/creditada|";
        assertEquals (expected, sb.toString());
    }
}
