package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD101Test {

    public RegistroD101Test() {
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
    public void RegistroD101Test() {
        RegistroD101 reg = new RegistroD101();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD101.IND_NAT_FRT, "1");
        //03
        line.setFieldValue(RegistroD101.VL_ITEM, 123.98);
        //04
        line.setFieldValue(RegistroD101.CST_PIS, 12L);
        //05
        line.setFieldValue(RegistroD101.NAT_BC_CRED, "12");
        //06
        line.setFieldValue(RegistroD101.VL_BC_PIS, 95.65);
        //07
        line.setFieldValue(RegistroD101.ALIQ_PIS, 12345678.7654);
        //08
        line.setFieldValue(RegistroD101.VL_PIS, 123.98);
        //09
        line.setFieldValue(RegistroD101.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|D101|1|123,98|12|12|95,65|12345678,7654|123,98|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());

    }
}
