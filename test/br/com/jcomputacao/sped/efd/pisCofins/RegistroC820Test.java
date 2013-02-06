package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Cesário
 */
public class RegistroC820Test {
    
    public RegistroC820Test (){
    
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
    public void RegistroC820Test (){
        RegistroC820 reg = new RegistroC820();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC820.CFOP, 1004);
        //03
        line.setFieldValue(RegistroC820.VL_ITEM, 123456789123.12);
        //04
        line.setFieldValue(RegistroC820.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //05
        line.setFieldValue(RegistroC820.CST_PIS, 12);
        //06
        line.setFieldValue(RegistroC820.QUANT_BC_PIS, 123456789123.123);
        //07
        line.setFieldValue(RegistroC820.ALIQ_PIS_QUANT, 123456789123.5678);
        //08
        line.setFieldValue(RegistroC820.VL_PIS, 123456789123.56);
        //09
        line.setFieldValue(RegistroC820.CST_COFINS, 34);
        //10
        line.setFieldValue(RegistroC820.QUANT_BC_COFINS, 123456789123.123);
        //11
        line.setFieldValue(RegistroC820.ALIQ_COFINS_QUANT, 123456789123.5678);
        //12
        line.setFieldValue(RegistroC820.VL_COFINS, 123456789123.56);
        //13
        line.setFieldValue(RegistroC820.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.println(sb);
//        String expected = "|C820|1004|123456789123,12|Código do item (campo 02 do Registro 0200)|12|123456789123,123|123456789123,5678|123456789123,56|34|123456789123,123|123456789123,5678|123456789123,56|Código da conta analítica contábil debitada/creditada|";
//        System.out.print(expected);
//        assertEquals (expected, sb.toString());
    }
}
