package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 20:39:42
 * @author John
 */
public class RegistroC491Test {

    public RegistroC491Test() {
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
    public void RegistroC491Test() {
        RegistroC491 reg = new RegistroC491();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC491.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //03
        line.setFieldValue(RegistroC491.CST_PIS, 22L);
        //04
        line.setFieldValue(RegistroC491.CFOP, 1234L);
        //05
        line.setFieldValue(RegistroC491.VL_ITEM, 12911.11);
        //06
        line.setFieldValue(RegistroC491.VL_BC_PIS, 1234678911.11);
        //07
        line.setFieldValue(RegistroC491.ALIQ_PIS, 12678.1111);
        //08
        line.setFieldValue(RegistroC491.QUANT_BC_PIS, 12678911.111);
        //09
        line.setFieldValue(RegistroC491.ALIQ_PIS_QUANT, 128911.1111);
        //10
        line.setFieldValue(RegistroC491.VL_PIS, 123478911.11);
        //11
        line.setFieldValue(RegistroC491.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        
//        String expected = "|C491|Código do item (campo 02 do Registro 0200)|22|1234|12911,11|1234678911,11|12678,1111|12678911,111|128911,1111|123478911,11|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
