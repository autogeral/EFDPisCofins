package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 19:58:50
 * @author Jonas
 */
public class RegistroF111Test {

    public RegistroF111Test() {
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
    public void registroF111test() throws ParseException {
        
        RegistroF111 reg = new RegistroF111();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF111.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroF111.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|F111|Identif do process|9|";
//        assertEquals(expected, sb.toString());
    }
}
