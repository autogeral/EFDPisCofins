package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 20:52:13
 * @author Jonas
 */
public class RegistroF129Test {
    
     public RegistroF129Test() {
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
    public void registroF129test() throws ParseException {
        
        RegistroF129 reg = new RegistroF129();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF129.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroF129.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|F129|Identif do process|9|";
//        assertEquals(expected, sb.toString());
    }
    
}
