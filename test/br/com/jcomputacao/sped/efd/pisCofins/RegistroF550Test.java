package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroF550Test {
    public RegistroF550Test(){
    
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
    public void RegistroF550Test(){
        RegistroF550 reg = new RegistroF550();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF550.VL_REC_COMP, 123.23);
        //03
        line.setFieldValue(RegistroF550.CST_PIS,12);
        //04
        line.setFieldValue(RegistroF550.VL_DESC_PIS, 123.23);
        //05
        line.setFieldValue(RegistroF550.VL_BC_PIS, 123.23);
        //06
        line.setFieldValue(RegistroF550.ALIQ_PIS, 123.2334);
        //07
        line.setFieldValue(RegistroF550.VL_PIS, 123.23);
        //08
        line.setFieldValue(RegistroF550.CST_COFINS, 2);
        //09
        line.setFieldValue(RegistroF550.VL_DESC_COFINS, 123.23);
        //10
        line.setFieldValue(RegistroF550.VL_BC_COFINS, 123.23);
        //11
        line.setFieldValue(RegistroF550.ALIQ_COFINS, 123.2334);
        //12
        line.setFieldValue(RegistroF550.VL_COFINS, 123.23);
        //13
        line.setFieldValue(RegistroF550.COD_MOD, "13");
        //14
        line.setFieldValue(RegistroF550.CFOP, 1234);
        //15
        line.setFieldValue(RegistroF550.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        //16
        line.setFieldValue(RegistroF550.INFO_COMPL, "Informação complementar");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|F550|123,23|12|123,23|123,23|123,2334|123,23|02|123,23|123,23|123,2334|123,23|13|1234|Código da conta analítica contábil debitada/creditada|Informação complementar|";
//        assertEquals (expected, sb.toString());
    }
}
