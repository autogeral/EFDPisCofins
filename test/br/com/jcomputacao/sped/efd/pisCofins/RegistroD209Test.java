package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD209Test {
     public RegistroD209Test() {
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
    public void RegistroD209Test() {
        RegistroD209 reg = new RegistroD209();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD209.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroD209.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|D209|Identif do process|9|";
//        assertEquals(expected, sb.toString());
    }
}
