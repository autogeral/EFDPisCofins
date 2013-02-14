package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 09/11/2011 19:23:23
 * @author Jonas
 */
public class RegistroA001Test {
    
    public RegistroA001Test(){
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
    public void RegistroA001Test(){
        
        RegistroA001 reg = new RegistroA001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroA001.IND_MOV, "0");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|A001|0|";
//        assertEquals (expected, sb.toString());
    }
}
