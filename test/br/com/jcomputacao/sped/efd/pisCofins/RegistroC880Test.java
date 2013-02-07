package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Feb 6, 2013 4:55:11 PM
 * @author Jennifer
 */
public class RegistroC880Test {
    
    public RegistroC880Test(){
    
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
    public void RegistroC880Test(){
        RegistroC880 reg = new RegistroC880();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroC880.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //03
        line.setFieldValue(RegistroC880.CFOP, 1234);
        //04
        line.setFieldValue(RegistroC880.VL_ITEM, 100000000000.02);
        //05
        line.setFieldValue(RegistroC880.CST_PIS, 12);
        //06
        line.setFieldValue(RegistroC880.QUANT_BC_PIS, 200000000000.003);        
        //07 
        line.setFieldValue(RegistroC880.ALIQ_PIS_QUANT, 300000000000.0004);       
        //08
        line.setFieldValue(RegistroC880.VL_PIS, 100000000000.02);        
        //09
        line.setFieldValue(RegistroC880.CST_COFINS, 13);        
        //10 
        line.setFieldValue(RegistroC880.QUANT_BC_COFINS, 200000000000.003);        
        //11 
        line.setFieldValue(RegistroC880.ALIQ_COFINS_QUANT, 300000000000.0004);       
        //12
        line.setFieldValue(RegistroC880.VL_COFINS, 100000000000.02);
        //13
        line.setFieldValue(RegistroC880.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|C880|Código do item (campo 02 do Registro 0200)|1234|100000000000,02|12|200000000000,003|300000000000,0004|100000000000,02|13|200000000000,003|300000000000,0004|100000000000,02|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
