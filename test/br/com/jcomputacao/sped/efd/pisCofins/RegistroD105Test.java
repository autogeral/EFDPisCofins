package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD105Test {

    public RegistroD105Test() {
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
    public void RegistroD105Test() {
        RegistroD105 reg = new RegistroD105();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD105.IND_NAT_FRT, "1");
        //03
        line.setFieldValue(RegistroD105.VL_ITEM, 123.98);
        //04
        line.setFieldValue(RegistroD105.CST_COFINS, 12L);
        //05
        line.setFieldValue(RegistroD105.NAT_BC_CRED, "12");
        //06
        line.setFieldValue(RegistroD105.VL_BC_COFINS, 95.65);
        //07
        line.setFieldValue(RegistroD105.ALIQ_COFINS, 12345678.7654);
        //08
        line.setFieldValue(RegistroD105.VL_COFINS, 123.98);
        //09
        line.setFieldValue(RegistroD105.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|D105|1|123,98|12|12|95,65|12345678,7654|123,98|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
