package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 21:59:44
 * @author John
 */
public class RegistroC501Test {

    public RegistroC501Test() {

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
    public void RegistroC501Test() {
                RegistroC501 reg = new RegistroC501();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC501.CST_PIS, 99L);
        //03
        line.setFieldValue(RegistroC501.VL_ITEM, 45678911.11);
        //04
        line.setFieldValue(RegistroC501.NAT_BC_CRED, "AB");
        //05
        line.setFieldValue(RegistroC501.VL_BC_PIS, 45678911.11);
        //06
        line.setFieldValue(RegistroC501.ALIQ_PIS, 1234567.1111);
        //07
        line.setFieldValue(RegistroC501.VL_PIS, 45678911.11);
        //08
        line.setFieldValue(RegistroC501.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|C501|99|45678911,11|AB|45678911,11|1234567,1111|45678911,11|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
