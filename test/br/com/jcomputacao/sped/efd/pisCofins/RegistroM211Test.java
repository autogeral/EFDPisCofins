package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 21/11/2011 19:06:25
 * @author rafael.galvao
 */
public class RegistroM211Test {
    
    public RegistroM211Test() {
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
     * Test of getNome method, of class RegistroM211.
     */
    @Test
    public void RegistroM211Test() throws ParseException {
        RegistroM211 reg = new RegistroM211();
        LineModel line = reg.createModel();
     
        //02
        line.setFieldValue(RegistroM211.IND_TIP_COOP, 2);
        //03
        line.setFieldValue(RegistroM211.VL_BC_CONT_ANT_EXC_COOP, 100000000000.01);
        //04
        line.setFieldValue(RegistroM211.VL_EXC_COOP_GER, 100000000000.01);   
        //05 
        line.setFieldValue(RegistroM211.VL_EXC_ESP_COOP, 100000000000.01);
        //06
        line.setFieldValue(RegistroM211.VL_BC_CONT, 100000000000.01);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M211|02|100000000000,01|100000000000,01|100000000000,01|100000000000,01|";
//	assertEquals (expected, sb.toString());
    }
}
