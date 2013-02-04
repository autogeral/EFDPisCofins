package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 12/11/2011 11:03:29
 * @author rafael.galvao
 */
public class RegistroC198Test extends Randomize {
    
    public RegistroC198Test() {
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
     * Test of getNome method, of class RegistroC198.
     */
    @Test
    public void RegistroC198Test(){
        RegistroC198 reg = new RegistroC198();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC198.NUM_PROC, "Identif do processo");
        //03
        line.setFieldValue(RegistroC198.IND_PROC, "2");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        
//        String expected = "|C198|Identif do processo|2|";
//        assertEquals (expected,sb.toString());
//        
    }
}
