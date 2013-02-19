package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroP990Test {
    public RegistroP990Test() {
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
     * Test of getNome method, of class RegistroM990.
     */
    @Test
    public void RegistroP990Test(){
        RegistroP990 reg = new RegistroP990();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroP990.QTD_LIN_P, 2);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|P990|0|";
//        assertEquals (expected, sb.toString());      
    }
}
