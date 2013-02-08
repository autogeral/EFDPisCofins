package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD505Test {
    public RegistroD505Test() {
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
    public void RegistroD505Test() {
        RegistroD505 reg = new RegistroD505();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD505.CST_COFINS, 99L);
        //03
        line.setFieldValue(RegistroD505.VL_ITEM, 345678911.11);
        //04
        line.setFieldValue(RegistroD505.NAT_BC_CRED, "12");
        //05
        line.setFieldValue(RegistroD505.VL_BC_COFINS, 5678911.11);
        //06
        line.setFieldValue(RegistroD505.ALIQ_COFINS, 12345678.1111);
        //07
        line.setFieldValue(RegistroD505.VL_COFINS, 345678911.11);
        //08
        line.setFieldValue(RegistroD505.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|D505|99|345678911,11|12|5678911,11|12345678,1111|345678911,11|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
