package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 22:16:22
 * @author Jonas
 */
public class RegistroF139Test {
    
    public RegistroF139Test() {
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
    public void registroF139test() throws ParseException {
        
        RegistroF139 reg = new RegistroF139();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroF139.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroF139.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|F139|Identif do process|9|";
//        assertEquals(expected, sb.toString());
    }
}
