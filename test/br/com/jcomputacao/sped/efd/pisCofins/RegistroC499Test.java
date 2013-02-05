package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 21:34:15
 * @author John
 */
public class RegistroC499Test {

    public RegistroC499Test() {
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
    public void RegistroC499Test() {
        RegistroC499 reg = new RegistroC499();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC499.NUM_PROC, "Identific processo");
        //03
        line.setFieldValue(RegistroC499.IND_PROC, "3");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|C499|Identific processo|3|";
        assertEquals (expected, sb.toString());
    }
}
