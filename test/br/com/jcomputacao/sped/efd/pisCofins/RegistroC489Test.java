package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * 10/11/2011 20:23:46
 * @author John
 */
public class RegistroC489Test {

    public RegistroC489Test() {
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
    public void RegistroC489Test() {
        RegistroC489 reg = new RegistroC489();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC489.NUM_PROC, "Identific. do proces");
        //03
        line.setFieldValue(RegistroC489.IND_PROC, "2");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C489|Identific. do proces|2|";
//        assertEquals (expected, sb.toString());
    }
}
