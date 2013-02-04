package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 19:18:21
 * @author John
 */
public class RegistroC396Test {

    public RegistroC396Test() {
        
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
     * Test of getNome method, of class RegistroC396.
     */
    @Test
    public void RegistroC396Test() {
        RegistroC396 reg = new RegistroC396();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC396.COD_ITEM,"Código do item (campo 02 do Registro 0200)");
        //03
        line.setFieldValue(RegistroC396.VL_ITEM, 67890.99);
        //04
        line.setFieldValue(RegistroC396.VL_DESC,null);
        //05
        line.setFieldValue(RegistroC396.NAT_BC_CRED,"AA");
        //06
        line.setFieldValue(RegistroC396.CST_PIS,12L);
        //07
        line.setFieldValue(RegistroC396.VL_BC_PIS,567890.99);
        //08
        line.setFieldValue(RegistroC396.ALIQ_PIS,12345678.9901);
        //09
        line.setFieldValue(RegistroC396.VL_PIS,890.91);
        //10
        line.setFieldValue(RegistroC396.CST_COFINS,12L);
        //11
        line.setFieldValue(RegistroC396.VL_BC_COFINS,890.99);
        //12
        line.setFieldValue(RegistroC396.ALIQ_COFINS,12345678.9901);
        //13
        line.setFieldValue(RegistroC396.VL_COFINS,12890.99);
        //14
        line.setFieldValue(RegistroC396.COD_CTA,"Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.println(sb);
//        String expected = "|C396|Código do item (campo 02 do Registro 0200)|67890,99||AA|12|567890,99|012345678,9901|890,91|12|890,99|12345678,9901|12890,99|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }   
}
