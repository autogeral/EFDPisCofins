package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroF569Test {
    public RegistroF569Test() {

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
    public void Registro569Test() throws ParseException {

      RegistroF569 reg = new RegistroF569();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroF569.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroF569.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|F569|Identif do process|9|";
        assertEquals(expected, sb.toString());
    }
}
