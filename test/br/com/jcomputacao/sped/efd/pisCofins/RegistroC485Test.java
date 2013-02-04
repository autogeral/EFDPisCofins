package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 20:14:29
 * @author John
 */
public class RegistroC485Test {

    public RegistroC485Test() {
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
    public void RegistroC485Test() {
        RegistroC485 reg = new RegistroC485();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC485.CST_COFINS, 99L);
        //03
        line.setFieldValue(RegistroC485.VL_ITEM, 78911.11);
        //04
        line.setFieldValue(RegistroC485.VL_BC_COFINS, null);
        //05
        line.setFieldValue(RegistroC485.ALIQ_COFINS, null);
        //06
        line.setFieldValue(RegistroC485.QUANT_BC_COFINS, 122.111);
        //07
        line.setFieldValue(RegistroC485.ALIQ_COFINS_QUANT, 21.1111);
        //08
        line.setFieldValue(RegistroC485.VL_COFINS, 678911.11);
        //09
        line.setFieldValue(RegistroC485.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //10
        line.setFieldValue(RegistroC485.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C485|99|78911,11|||122,111|21,1111|678911,11|Código do item (campo 02 do Registro 0200)|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
