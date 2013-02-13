package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 11/11/2011 18:45:02
 * @author rafael.galvao
 */
public class RegistroC185Test extends Randomize {
    
    public RegistroC185Test(){
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
     * Test of getNome method, of class RegistroC185.
     */
    @Test
    public void RegistroC185Test(){
        RegistroC185 reg = new RegistroC185();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC185.CST_COFINS, 12L);
        //03
        line.setFieldValue(RegistroC185.CFOP, 1234L);
        //04
        line.setFieldValue(RegistroC185.VL_ITEM, 18912.33);
        //05
        line.setFieldValue(RegistroC185.VL_DESC, 789456345.66);
        //06
        line.setFieldValue(RegistroC185.VL_BC_COFINS, 45623.99);
        //07
        line.setFieldValue(RegistroC185.ALIQ_COFINS, 1238.6611);
        //08
        line.setFieldValue(RegistroC185.QUANT_BC_COFINS, 678912.363);
        //09
        line.setFieldValue(RegistroC185.ALIQ_COFINS_QUANT, 123412.1234);
        //10
        line.setFieldValue(RegistroC185.VL_COFINS, 128912.36);
        //11
        line.setFieldValue(RegistroC185.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.println(sb);
//        String expected = "|C185|12|1234|18912,33|789456345,66|45623,99|1238,6611|678912,363|123412,1234|128912,36|Código da conta analítica contábil debitada/creditada|";
//        System.out.println(expected);
//        assertEquals (expected, sb.toString());
    }
}
