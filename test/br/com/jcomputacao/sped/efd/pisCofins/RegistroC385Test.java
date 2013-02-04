package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 09/11/2011 21:54:20
 * @author John
 */
public class RegistroC385Test {
    
    public RegistroC385Test() {
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
     * Test of getNome method, of class RegistroC385.
     */
    @Test
    public void RegistroC385Test() {
        RegistroC385 reg = new RegistroC385();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroC385.CST_COFINS, 45L);
        //03
        line.setFieldValue(RegistroC385.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //04
        line.setFieldValue(RegistroC385.VL_ITEM, 0.00);
        //05
        line.setFieldValue(RegistroC385.VL_BC_COFINS, null);
        //06
        line.setFieldValue(RegistroC385.ALIQ_COFINS, 678.1234);
        //07
        line.setFieldValue(RegistroC385.QUANT_BC_COFINS, 8911.111);
        //08
        line.setFieldValue(RegistroC385.ALIQ_COFINS_QUANT, 78911.1221);
        //09
        line.setFieldValue(RegistroC385.VL_COFINS, 8911.21);
        //10
        line.setFieldValue(RegistroC385.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.println(sb);
//        String expected = "|C385|45|Código do item (campo 02 do Registro 0200)|0,00||678,1234|8911,111|78911,1221|8911,21|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
