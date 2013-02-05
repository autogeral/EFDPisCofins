package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroC601Test {
      public RegistroC601Test() {
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
    public void RegistroC601Test(){
        RegistroC601 reg = new RegistroC601();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC601.CST_PIS, 93L);
        //03
        line.setFieldValue(RegistroC601.VL_ITEM, 222.76);
        //04
        line.setFieldValue(RegistroC601.VL_BC_PIS, 493.45);
        //05
        line.setFieldValue(RegistroC601.ALIQ_PIS, 11111111.4444);
        //06
        line.setFieldValue(RegistroC601.VL_PIS, 234.34);
        //07
        line.setFieldValue(RegistroC601.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C601|93|222,76|493,45|11111111,4444|234,34|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}

