package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroF519Test {
    public RegistroF519Test() {

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
    public void RegistroF519Test() throws ParseException {

      RegistroF519 reg = new RegistroF519();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroF519.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroF519.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|F519|Identif do process|9|";
//        assertEquals(expected, sb.toString());

    }
}
