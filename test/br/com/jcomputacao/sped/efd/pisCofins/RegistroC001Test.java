package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author rafael.galvao
 */
public class RegistroC001Test {
    
    public RegistroC001Test() {
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
    public String linhaRegistroC001Test(){
        RegistroC001 reg = new RegistroC001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC001.IND_MOV, "0");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|C001|0|";
//        assertEquals (expected, sb.toString());
        return sb.toString();
    }
}
