package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Jennifer
 */
public class RegistroM100Test {
    public RegistroM100Test(){
    
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
    public void RegistroM100Test(){
        RegistroM100 reg = new RegistroM100();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroM100.COD_CRED, "001");
        //03
        line.setFieldValue(RegistroM100.IND_CRED_ORI, 2);
        //04
        line.setFieldValue(RegistroM100.VL_BC_PIS, 100000000000.02);
        //05
        line.setFieldValue(RegistroM100.ALIQ_PIS, 10000000.0003);
        //06
        line.setFieldValue(RegistroM100.QUANT_BC_PIS, 200000000000.003);        
        //07 
        line.setFieldValue(RegistroM100.ALIQ_PIS_QUANT, 300000000000.0004);       
        //08
        line.setFieldValue(RegistroM100.VL_CRED, 100000000000.02);        
        //09
        line.setFieldValue(RegistroM100.VL_AJUS_ACRES, 100000000000.02);        
        //10 
        line.setFieldValue(RegistroM100.VL_AJUS_REDUC, 20000000000.03);        
        //11 
        line.setFieldValue(RegistroM100.VL_CRED_DIF, 300000000000.04);       
        //12
        line.setFieldValue(RegistroM100.VL_CRED_DISP, 100000000000.02);
        //13
        line.setFieldValue(RegistroM100.IND_DESC_CRED, "C");
        //14
        line.setFieldValue(RegistroM100.VL_CRED_DESC, 100000000000.02);
        //15
        line.setFieldValue(RegistroM100.SLD_CRED, 300000000000.02);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
        String expected = "|M100|001|2|100000000000,02|10000000,0003|200000000000,003|300000000000,0004|100000000000,02|100000000000,02|20000000000,03|300000000000,04|100000000000,02|C|100000000000,02|300000000000,02|";
        assertEquals (expected, sb.toString());
    }

}
