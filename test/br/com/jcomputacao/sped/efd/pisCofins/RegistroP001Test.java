package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroP001Test {
     public RegistroP001Test() {
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
    public void RegistroP001Test() {
        RegistroP001 reg = new RegistroP001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroP001.IND_MOV, "1");
            
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|P001|1|";
//        assertEquals (expected, sb.toString());
    }
}
