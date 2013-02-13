package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;


/**
 * 17/11/2011 20:22:09
 * @author rafael.galvao
 */
public class RegistroM505Test extends Randomize{
    
    public RegistroM505Test() {
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
     * Test of getNome method, of class RegistroM505.
     */
    @Test
    public void RegistroM505Test(){
        RegistroM505 rm = new RegistroM505();
        LineModel line = rm.createModel();
        
        //02
        line.setFieldValue(RegistroM505.NAT_BC_CRED, "22");
        //03
        line.setFieldValue(RegistroM505.CST_COFINS, 32);
        //04
        line.setFieldValue(RegistroM505.VL_BC_COFINS_TOT, 100000000000.01);
        //05
        line.setFieldValue(RegistroM505.VL_BC_COFINS_CUM, 200000000000.02);
        //06
        line.setFieldValue(RegistroM505.VL_BC_COFINS_NC,300000000000.03);
        //07
        line.setFieldValue(RegistroM505.VL_BC_COFINS, 400000000000.04);
        //08
        line.setFieldValue(RegistroM505.QUANT_BC_COFINS_TOT, 500000000000.005);
        //09
        line.setFieldValue(RegistroM505.QUANT_BC_COFINS, 600000000000.006);
        //10
        line.setFieldValue(RegistroM505.DESC_CRED, "Descrição do crédito");
     
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M505|22|32|100000000000,01|200000000000,02|300000000000,03|400000000000,04|500000000000,005|600000000000,006|Descrição do crédito|";
//	assertEquals (expected, sb.toString());
    }
}
