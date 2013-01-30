package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 09/11/2011 19:33:43
 * @author Jonas
 */
public class RegistroA010Test {
    
     public RegistroA010Test(){
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
    public String linhaRegistroA010Test(){
        RegistroA010 reg = new RegistroA010();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroA010.CNPJ, 12345678910123L);
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|A010|12345678910123|";
//        assertEquals (expected, sb.toString());
        return sb.toString();
    }

}
