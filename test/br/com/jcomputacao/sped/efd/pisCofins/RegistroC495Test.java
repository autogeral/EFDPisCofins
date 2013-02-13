package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 21:24:01
 * @author John
 */
public class RegistroC495Test {

    public RegistroC495Test() {        
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
    public void RegistroC495Test() {
        RegistroC495 reg = new RegistroC495();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC495.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //03
        line.setFieldValue(RegistroC495.CST_COFINS, 22L);
        //04
        line.setFieldValue(RegistroC495.CFOP, 1234L);
        //05
        line.setFieldValue(RegistroC495.VL_ITEM, 678911.11);
        //06
        line.setFieldValue(RegistroC495.VL_BC_COFINS, 678911.11);
        //07
        line.setFieldValue(RegistroC495.ALIQ_COFINS, 345678.1121);
        //08
        line.setFieldValue(RegistroC495.QUANT_BC_COFINS, 678911.111);
        //09
        line.setFieldValue(RegistroC495.ALIQ_COFINS_QUANT, 678911.1111);
        //10
        line.setFieldValue(RegistroC495.VL_COFINS, 678911.11);
        //11
        line.setFieldValue(RegistroC495.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C495|Código do item (campo 02 do Registro 0200)|22|1234|678911,11|678911,11|345678,1121|678911,111|678911,1111|678911,11|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
