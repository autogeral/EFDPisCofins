package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 10/11/2011 21:48:02
 * @author rafael.galvao
 */
public class RegistroC181Test extends Randomize {
    
    public RegistroC181Test() {
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
     * Test of getNome method, of class RegistroC181.
     */
    @Test
    public void RegistroC181Test(){
        RegistroC181 reg = new RegistroC181();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC181.CST_PIS, 12);
        //03
        line.setFieldValue(RegistroC181.CFOP, 1234);
        //04
        line.setFieldValue(RegistroC181.VL_ITEM, 5678912.33);
        //05
        line.setFieldValue(RegistroC181.VL_DESC, 612332.66);
        //06
        line.setFieldValue(RegistroC181.VL_BC_PIS, 2345612.33);
        //07
        line.setFieldValue(RegistroC181.ALIQ_PIS, 12345678.1234);
        //08
        line.setFieldValue(RegistroC181.QUANT_BC_PIS, 345678912.123);
        //09
        line.setFieldValue(RegistroC181.ALIQ_PIS_QUANT, 78912.1234);
        //10
        line.setFieldValue(RegistroC181.VL_PIS, 912345.12);
        //11
        line.setFieldValue(RegistroC181.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.println(sb);
//        String expected = "|C181|12|1234|5678912,33|612332,66|2345612,33|12345678,1234|345678912,123|78912,1234|912345,12|Código da conta analítica contábil debitada/creditada|";
//        System.out.println(expected);
//        assertEquals (expected, sb.toString());
    }
}
