
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 24/11/2011 08:35:36
 * @author Douglas
 */
public class RegistroF211Test {


  public RegistroF211Test() {

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
    public void registroF211test() throws ParseException {

      RegistroF211 reg = new RegistroF211();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroF211.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroF211.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|F211|Identif do process|9|";
//        assertEquals(expected, sb.toString());

    }
}
