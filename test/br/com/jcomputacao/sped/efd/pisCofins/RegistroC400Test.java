package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 10/11/2011 19:33:42
 * @author John
 */
public class RegistroC400Test {

    public RegistroC400Test() {
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

    /**
     * Test of getNome method, of class RegistroC400.
     */
    @Test
    public void RegistroC400Test() {
        RegistroC400 reg = new RegistroC400();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC400.COD_MOD, "12");
        //03
        line.setFieldValue(RegistroC400.ECF_MOD, "Mod. equipamento");
        //04
        line.setFieldValue(RegistroC400.ECF_FAB, "Serie Fab. ECF");
        //05
        line.setFieldValue(RegistroC400.ECF_CX, 123L);
        
        StringBuffer sb = line.getRepresentation();
        System.out.println(sb);
        String expected = "|C400|12|Mod. equipamento|Serie Fab. ECF|123|";
        assertEquals (expected,sb.toString());
    }
}
