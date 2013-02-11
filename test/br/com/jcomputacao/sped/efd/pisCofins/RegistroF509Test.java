package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroF509Test {
    public RegistroF509Test() {

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
    public void registroF509test() throws ParseException {

      RegistroF509 reg = new RegistroF509();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroF509.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroF509.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|F509|Identif do process|9|";
//        assertEquals(expected, sb.toString());

    }
}
