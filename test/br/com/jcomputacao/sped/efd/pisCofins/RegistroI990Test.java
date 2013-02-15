package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroI990Test {
    public RegistroI990Test() {
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
    public void RegistroI990Test(){
        RegistroI990 reg = new RegistroI990();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroI990.QTD_LIN_I, 150);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|I990|150|";
//        assertEquals (expected, sb.toString());      
    }
}
