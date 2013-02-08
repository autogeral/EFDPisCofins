package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.*;

/**
 * 10/11/2011 22:11:17
 * @author John
 */
public class RegistroC505Test {

    public RegistroC505Test() {
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
    public void RegistroC505Test() {
        RegistroC505 reg = new RegistroC505();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC505.CST_COFINS, 99L);
        //03
        line.setFieldValue(RegistroC505.VL_ITEM, 345678911.11);
        //04
        line.setFieldValue(RegistroC505.NAT_BC_CRED, "12");
        //05
        line.setFieldValue(RegistroC505.VL_BC_COFINS, 5678911.11);
        //06
        line.setFieldValue(RegistroC505.ALIQ_COFINS, 12345678.1111);
        //07
        line.setFieldValue(RegistroC505.VL_COFINS, 345678911.11);
        //08
        line.setFieldValue(RegistroC505.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        
//        String expected = "|C505|99|345678911,11|12|5678911,11|12345678,1111|345678911,11|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
