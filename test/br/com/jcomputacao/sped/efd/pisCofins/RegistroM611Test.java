
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;


/**
 * 17/11/2011 19:32:27
 * @author rafael.galvao
 */
public class RegistroM611Test {
    
    public RegistroM611Test() {
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
     * Test of getNome method, of class RegistroM611.
     */
    @Test
    public void RegistroM611Test(){
        RegistroM611 rm = new RegistroM611();
        LineModel line = rm.createModel();
        
        //02
        line.setFieldValue(RegistroM611.IND_TIP_COOP, 99);
        //03
        line.setFieldValue(RegistroM611.VL_BC_CONT_ANT_EXC_COOP, 100000000000.01);
        //04
        line.setFieldValue(RegistroM611.VL_EXC_COOP_GER, 200000000000.02);
        //05
        line.setFieldValue(RegistroM611.VL_EXC_ESP_COOP, 300000000000.03);
        //06
        line.setFieldValue(RegistroM611.VL_BC_CONT, 400000000000.04);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M611|99|100000000000,01|200000000000,02|300000000000,03|400000000000,04|";
//	assertEquals (expected, sb.toString());
    }
}
