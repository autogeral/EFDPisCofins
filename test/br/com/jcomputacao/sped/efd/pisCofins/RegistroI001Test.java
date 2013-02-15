package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroI001Test {
     public RegistroI001Test() {
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
    public void RegistroI001Test() {
        RegistroI001 reg = new RegistroI001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroI001.IND_MOV, "1");
            
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|I001|1|";
//        assertEquals (expected, sb.toString());
    }
}
