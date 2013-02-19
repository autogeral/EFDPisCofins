package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD001Test {

    public RegistroD001Test() {
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
    public void RegistroD001Test() {
        RegistroD001 reg = new RegistroD001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD001.IND_MOV, "1");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|D001|0|";
//        assertEquals (expected, sb.toString());
    }
}
