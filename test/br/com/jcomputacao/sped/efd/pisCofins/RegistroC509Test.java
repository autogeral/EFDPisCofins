package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 22:18:36
 * @author John
 */
public class RegistroC509Test {

    public RegistroC509Test() {
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
    public void RegistroC509Test() {
        
        RegistroC509 reg = new RegistroC509();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC509.NUM_PROC, "Identific do process");
        //03
        line.setFieldValue(RegistroC509.IND_PROC, "3");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|C509|Identific do process|3|";
        assertEquals (expected, sb.toString());
    }
}
