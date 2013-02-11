
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 24/11/2011 12:00:27
 * @author Douglas
 */
public class RegistroF990Test {


  public RegistroF990Test() {

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
    public void registroF990test() throws ParseException {

      RegistroF990 reg = new RegistroF990();
        LineModel line = reg.createModel();


        //02
        line.setFieldValue(RegistroF990.QTD_LIN_F, 150);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F990|150|";
//        assertEquals (expected, sb.toString());
    }
}
