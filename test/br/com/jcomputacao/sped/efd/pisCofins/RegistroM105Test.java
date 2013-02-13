package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroM105Test {
       public RegistroM105Test() {
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
    public void RegistroM105Test() {
        RegistroM105 reg = new RegistroM105();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM105.NAT_BC_CRED, "12");
        //03
        line.setFieldValue(RegistroM105.CST_PIS, 31L);
        //04
        line.setFieldValue(RegistroM105.VL_BC_PIS_TOT, 123.34);
        //05
        line.setFieldValue(RegistroM105.VL_BC_PIS_CUM, 165.34);
        //06
        line.setFieldValue(RegistroM105.VL_BC_PIS_NC, 321.34);
        //07
        line.setFieldValue(RegistroM105.VL_BC_PIS, 123.34);
        //08
        line.setFieldValue(RegistroM105.QUANT_BC_PIS_TOT, 123.334);
        //09
        line.setFieldValue(RegistroM105.QUANT_BC_PIS, 123.334);
        //10
        line.setFieldValue(RegistroM105.DESC_CRED, "Descrição do crédito");
              
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|M105|12|31|123,34|165,34|321,34|123,34|123,334|123,334|Descrição do crédito|";
        assertEquals (expected, sb.toString());
    }
}
